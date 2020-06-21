import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.sound.sampled.Port;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PortfolioTest {


    Portfolio portfolio;

    @Before
    public void setUp() throws Exception {
        portfolio = new Portfolio();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddSingleUnit() {
        InvestmentUnit unit = new InvestmentUnit(0, null, null);
        portfolio.addUnit(unit);
        assertEquals(1, portfolio.getCount());
    }

    @Test
    public void testMoreThanDefaultCapacity() {
        InvestmentUnit unit1 = new InvestmentUnit(0, null, null);
        InvestmentUnit unit2 = new InvestmentUnit(0, null, null);
        InvestmentUnit unit3 = new InvestmentUnit(0, null, null);

        portfolio.addUnit(unit1);
        portfolio.addUnit(unit2);
        portfolio.addUnit(unit3);

        assertEquals(3, portfolio.getCount());
    }

    @Mock
    Instrument instrument1;
    @Mock
    Instrument instrument2;
    @Mock
    Instrument instrument3;


    @Test
    public void testSumGivenCurrency() {
        when(instrument1.getPrice()).thenReturn(1000);
        InvestmentUnit unit = new InvestmentUnit(5, instrument1, Currency.HUF);
        portfolio.addUnit(unit);
        assertEquals(5000, portfolio.totalSum(Currency.HUF));
    }

    @Test
    public void testSumOtherCurrency() {
        InvestmentUnit unit = new InvestmentUnit(5, instrument1, Currency.USD);
        portfolio.addUnit(unit);
        assertEquals(0, portfolio.totalSum(Currency.HUF));
    }

    @Test
    public void testSumMultipleCurrency() {
        when(instrument2.getPrice()).thenReturn(5000);
        InvestmentUnit unit1 = new InvestmentUnit(5, instrument1, Currency.USD);
        InvestmentUnit unit2 = new InvestmentUnit(5, instrument2, Currency.HUF);
        portfolio.addUnit(unit1);
        portfolio.addUnit(unit2);
        assertEquals(25000, portfolio.totalSum(Currency.HUF));
    }

    @Mock
    CurrencyConverter converter;

    @Test
    public void testOverallSumBaseCurrency() {
        when(instrument1.getPrice()).thenReturn(5000);
        InvestmentUnit unit1 = new InvestmentUnit(2, instrument1, Currency.HUF);
        InvestmentUnit unit2 = new InvestmentUnit(5, instrument1, Currency.HUF);
        portfolio.addUnit(unit1);
        portfolio.addUnit(unit2);
        assertEquals(35000, portfolio.totalSum(converter));
    }

    @Test
    public void testOverallSumTwoCurrency() {
        when(instrument1.getPrice()).thenReturn(1000);
        when(instrument2.getPrice()).thenReturn(100);
        InvestmentUnit unit1 = new InvestmentUnit(5, instrument1, Currency.HUF);
        InvestmentUnit unit2 = new InvestmentUnit(10, instrument2, Currency.USD);


        when(converter.convert(Currency.USD, Currency.HUF)).thenReturn(300);

        portfolio.addUnit(unit1);
        portfolio.addUnit(unit2);

        assertEquals(305000, portfolio.totalSum(converter));

    }

    @Test
    public void testOverallSumAllCurrency() {

        when(converter.convert(Currency.USD, Currency.HUF)).thenReturn(290);
        when(converter.convert(Currency.EUR, Currency.HUF)).thenReturn(325);

        when(instrument1.getPrice()).thenReturn(1000);
        when(instrument2.getPrice()).thenReturn(100);
        when(instrument3.getPrice()).thenReturn(10);

        InvestmentUnit unit1 = new InvestmentUnit(5, instrument1, Currency.HUF);
        InvestmentUnit unit2 = new InvestmentUnit(10, instrument2, Currency.USD);
        InvestmentUnit unit3 = new InvestmentUnit(100, instrument3, Currency.EUR);

        portfolio.addUnit(unit1);
        portfolio.addUnit(unit2);
        portfolio.addUnit(unit3);

        assertEquals(620000, portfolio.totalSum(converter));

    }
}