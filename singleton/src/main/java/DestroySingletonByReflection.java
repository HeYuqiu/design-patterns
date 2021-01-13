import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射破坏单例
 *
 * @author Yuqiu.He
 * @date 2021/1/13
 */
public class DestroySingletonByReflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> simpleSingleton4 = Class.forName("SimpleSingleton4");
        Constructor<?> constructor = simpleSingleton4.getDeclaredConstructor(null);
        // 取消权限控制检查
        constructor.setAccessible(true);
        SimpleSingleton4 demo1 = SimpleSingleton4.getInstance();
        SimpleSingleton4 demo2 = (SimpleSingleton4) constructor.newInstance();
        System.out.println(demo1 == demo2);


        // 避免反射破坏单例
        Class<?> simpleSingleton4AvoidReflection = Class.forName("SimpleSingleton4AvoidReflection");
        Constructor<?> constructor1 = simpleSingleton4AvoidReflection.getDeclaredConstructor(null);
        // 取消权限控制检查
        constructor1.setAccessible(true);
        SimpleSingleton4AvoidReflection demo3 = SimpleSingleton4AvoidReflection.getInstance();
        SimpleSingleton4AvoidReflection demo4 = (SimpleSingleton4AvoidReflection) constructor1.newInstance();
        System.out.println(demo3 == demo4);
    }
}
