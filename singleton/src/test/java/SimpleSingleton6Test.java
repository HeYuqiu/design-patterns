import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public class SimpleSingleton6Test extends SingletonTest<SimpleSingleton6> {

    public SimpleSingleton6Test() {
        super(() -> SimpleSingleton6.instance);
    }
}