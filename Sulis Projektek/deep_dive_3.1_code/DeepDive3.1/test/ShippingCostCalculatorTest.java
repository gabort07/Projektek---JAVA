/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import deepdive_31.Currency;
import deepdive_31.ShippingCostCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner; 
/**
 *
 * @author gaborT
 */
@RunWith(MockitoJUnitRunner.class)
public class ShippingCostCalculatorTest {
    
    public ShippingCostCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        scc = new ShippingCostCalculator();
    }
    
    @After
    public void tearDown() {
    }
    
    ShippingCostCalculator scc;
    
    @Test
    public void testLightCheap(){
        int cost = scc.calculate(5000, 1.5);
        assertEquals(2000, cost);
    }
    
    @Test
    public void testHeavyExpensive(){
        int cost = scc.calculate(16000, 6);
        assertEquals("Nehéz és drága termék esetén nem jó a kötlség", 6000, cost);
    }
    
    @Mock
    Currency c;
    
    @Test(expected = NullPointerException.class)
    public void testNull(){
        c = null;
        String result = scc.costToString(2000, c);
    }
    
    @Test
    public void testCostToString(){
       Mockito.when(c.getSign()).thenReturn("€");
       String result = scc.costToString(2000, c);
       assertEquals("2000 €", result);
    }
    
}
