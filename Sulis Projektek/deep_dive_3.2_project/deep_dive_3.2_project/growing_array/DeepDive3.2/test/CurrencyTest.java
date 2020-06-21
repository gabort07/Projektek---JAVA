import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEurToString() {
        assertEquals("EUR", Currency.EUR.toString());
    }

    @Test
    public void testHufToString() {
        assertEquals("HUF", Currency.HUF.toString());
    }

    @Test
    public void testUsdToString() {
        assertEquals("USD", Currency.USD.toString());
    }

}