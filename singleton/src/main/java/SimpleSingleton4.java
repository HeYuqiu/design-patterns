/**
 * 【双检锁/双重校验锁（DCL，即 double-checked locking）】
 * <p>
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：较复杂
 * <p>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public final class SimpleSingleton4 {
    // 为什么要用volatile
    private volatile static SimpleSingleton4 instance = null;

    private SimpleSingleton4() {
        System.out.println("init");
    }

    public static SimpleSingleton4 getInstance() {
        if (instance == null) {
            synchronized (SimpleSingleton4.class) {
                if (instance == null) {
                    // volatile的意义就在于此：防止指令重排序，这里new SimpleSingleton4()要氛围三步：
                    // 1、分配对象内存
                    // 2、调用构造器方法，执行初始化
                    // 3、将对象引用赋值给变量。
                    // 多线程情况下，如果不用volatile发生重排序，有可能对象已经不为null了但是还没有初始化完，这时另一个线程进来获取到一个错误的实例；
                    instance = new SimpleSingleton4();
                }
            }
        }
        return instance;
    }

}
