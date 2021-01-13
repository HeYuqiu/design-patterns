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
    private volatile static SimpleSingleton4 instance = null;

    private SimpleSingleton4() {
        System.out.println("init");
    }

    public static SimpleSingleton4 getInstance() {
        if (instance == null) {
            synchronized (SimpleSingleton4.class) {
                if (instance == null) {
                    instance = new SimpleSingleton4();
                }
            }
        }
        return instance;
    }

}
