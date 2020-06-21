import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InvestmentUnitTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCorrectCountConstructor() {
        InvestmentUnit unit = new InvestmentUnit(5, null, null);
        assertEquals(5, unit.getCount());
    }

    @Test
    public void testNegativeCountConstructor() {
        InvestmentUnit unit = new InvestmentUnit(-10, null, null);
        assertEquals(0, unit.getCount());
    }

    @Test
    public void testCorrectInstrumentConstructor() {
        Instrument i = new Instrument();
        InvestmentUnit unit = new InvestmentUnit(5, i, null);
        assertEquals(i, unit.getInstrument());
    }

    @Test
    public void testCorrectCurrencyConstructor() {
        InvestmentUnit unit = new InvestmentUnit(5, null, Currency.USD);
        assertEquals(Currency.USD, unit.getCurrency());
    }

    @Mock
    Instrument instrument;

    @Test
    public void testCorrectSum() {
        when(instrument.getPrice()).thenReturn(100);
        InvestmentUnit unit = new InvestmentUnit(10, instrument, null);
        assertEquals(1000, unit.getSum());
    }

    @Test
    public void testNegativeCountSum() {
        when(instrument.getPrice()).thenReturn(100);
        InvestmentUnit unit = new InvestmentUnit(-10, instrument, null);
        assertEquals(0, unit.getSum());
    }

    @Test
    public void testNegativePriceSum() {
        when(instrument.getPrice()).thenReturn(-100);
        InvestmentUnit unit = new InvestmentUnit(10, instrument, null);
        assertEquals(0, unit.getSum());
    }
}