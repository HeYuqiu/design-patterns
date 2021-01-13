/**
 * 防止利用反射破坏单例
 * 1、构造方法限制只能执行一次
 * 2、通过枚举，因为枚举没有构造方法
 */
public final class SimpleSingleton4AvoidReflection {

    //防止反射破坏单例
    private static boolean flag = true;
    private volatile static SimpleSingleton4AvoidReflection instance = null;

    private SimpleSingleton4AvoidReflection() {
        if (flag) {
            flag = !flag;
        } else {
            throw new RuntimeException("单例模式被侵犯");
        }

    }

    public static SimpleSingleton4AvoidReflection getInstance() {
        if (instance == null) {
            synchronized (SimpleSingleton4AvoidReflection.class) {
                if (instance == null) {
                    instance = new SimpleSingleton4AvoidReflection();
                }
            }
        }
        return instance;
    }

}
