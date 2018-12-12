import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/12.
 */
public class SimpleSingleton3Test extends SingletonTest<SimpleSingleton3> {

    public SimpleSingleton3Test() {
        super(SimpleSingleton3::getInstance);
    }
}