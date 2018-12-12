import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public abstract class SingletonTest<S> {
    private final Supplier<S> singletonSupplier;
    private List<S> list = new ArrayList<>();

    public SingletonTest(final Supplier<S> singletonSupplier) {
        this.singletonSupplier = singletonSupplier;
    }

    @Test
    public void testMultipleCallsReturnSameObjectInSameThread() {
        S singleton1 = singletonSupplier.get();
        S singleton2 = singletonSupplier.get();
        assertSame(singleton1, singleton2);

        System.out.println("testMultipleCallsReturnSameObjectInSameThread:  \nsingleton1:" + singleton1 + "\nsingleton2:" + singleton2);
    }

    @Test
    public void testMultipleCallsReturnSameObjectInDifferentThreads() throws InterruptedException, ExecutionException {

        // 先创建1000个任务去同时instance
        List<Callable<S>> callables = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            callables.add(singletonSupplier::get);
        }

        // 最多8个线程，同时创建对象
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<Future<S>> futures = executorService.invokeAll(callables);

        // 挨个比较
        S target = this.singletonSupplier.get();
        for (Future<S> future : futures) {
            final S instance = future.get();
            assertNotNull(instance);
            assertEquals(target, instance);

            //System.out.println("testMultipleCallsReturnSameObjectInDifferentThreads:  target:" + target + "  ---  future:" + instance);
        }

    }
}
