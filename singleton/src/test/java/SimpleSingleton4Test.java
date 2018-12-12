import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public class SimpleSingleton4Test extends SingletonTest<SimpleSingleton4> {

    public SimpleSingleton4Test() {
        super(SimpleSingleton4::getInstance);
    }
}