/**
 * 简单的单例：
 * Created by heyuqiu on 2018/12/6.
 */
public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }

}
