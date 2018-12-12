import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * Created by heyuqiu on 2018/12/6.
 */
public class SimpleSingleton1Test extends SingletonTest {

    public SimpleSingleton1Test() {
        super(SimpleSingleton1::getInstance);
    }
}