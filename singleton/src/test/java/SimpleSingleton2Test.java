import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public class SimpleSingleton2Test extends SingletonTest<SimpleSingleton2> {

    public SimpleSingleton2Test() {
        super(SimpleSingleton2::getInstance);
    }
}