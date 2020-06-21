/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1903_vakacio;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gaborT
 */
public class VakacioTest {
    
    public VakacioTest() {
    }
    
    SimpleDateFormat form = new SimpleDateFormat("yyyy.MM.dd.");
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void inputFormTest(){
        Calendar cal1 = new GregorianCalendar();
        cal1.set(2019, 10, 10, 0,0,0);
        String input ="-";
        assertEquals("A formátum ellenörző nem működik jól. ", null, Vakacio.vacationsCheckSet(input));
        String input2 = "2019.10.10.";
        assertEquals("A formátum ellenörző nem működik jól. ", cal1.getTime(), Vakacio.vacationsCheckSet(input2));
    }
    
    
}
