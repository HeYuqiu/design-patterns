import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public class SimpleSingleton5Test extends SingletonTest<SimpleSingleton5> {

    public SimpleSingleton5Test() {
        super(SimpleSingleton5::getInstance);
    }
}