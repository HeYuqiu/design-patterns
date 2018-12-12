/**
 * 简单的单例：
 * 最常用的，缺点：类加载时就new了实例，浪费！（浪费一点点其实影响不大，推荐使用这种！）
 * <p>
 * 【饿汉式】
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * <p>
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 * <p>
 * <p>
 * <p>
 * Created by heyuqiu on 2018/12/6.
 */
public final class SimpleSingleton1 {
    private static SimpleSingleton1 instance = new SimpleSingleton1();

    private SimpleSingleton1() {
    }

    public static SimpleSingleton1 getInstance() {
        return instance;
    }

}
