/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1601_dokumentum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabesz
 */
public class SzerkeszthetoDokumentumTest {

    public SzerkeszthetoDokumentumTest() {
    }

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
    public void constructorDefTest() {
        SzerkeszthetoDokumentum s = new SzerkeszthetoDokumentum();
        assertNull("A def. konstruktor nem NULL", s.getSzoveg());
    }

    @Test
    public void constructorParamTest() {
        SzerkeszthetoDokumentum s1 = new SzerkeszthetoDokumentum("");
        assertEquals("A param. konstr. nem üres Stringet készít", "", s1.getSzoveg());

        String main = "Autó légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";
        SzerkeszthetoDokumentum s2 = new SzerkeszthetoDokumentum(main);
        assertEquals("A param. kontr. nem a megfelelő Stringet készíti", main, s2.getSzoveg());
    }

    @Test
    public void beszurTest() {
        String main = "Autó légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";

        String uj = "kapca bodza ";

        String pozNull = "kapca bodza Autó légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";

        String pozTwelve = "Autó légzsákkapca bodza  macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";

        SzerkeszthetoDokumentum s = new SzerkeszthetoDokumentum();
        s.beszur(0, null);
        assertEquals("A beszur() nem jó ", null, s.getSzoveg());

        SzerkeszthetoDokumentum s0 = new SzerkeszthetoDokumentum();
        s0.beszur(0, uj);
        assertEquals("A beszur() nem jó ", uj, s0.getSzoveg());

        SzerkeszthetoDokumentum s1 = new SzerkeszthetoDokumentum(main);
        s1.beszur(-1, null);
        assertEquals("A beszur() nem jó ", main, s1.getSzoveg());

        SzerkeszthetoDokumentum s2 = new SzerkeszthetoDokumentum(main);
        s2.beszur(0, null);
        assertEquals("A beszur() nem jó ", main, s2.getSzoveg());

        SzerkeszthetoDokumentum s3 = new SzerkeszthetoDokumentum(main);
        s3.beszur(-1, uj);
        assertEquals("A beszur() nem jó ", main, s3.getSzoveg());

        SzerkeszthetoDokumentum s4 = new SzerkeszthetoDokumentum(main);
        s4.beszur(130, uj);
        assertEquals("A beszur() nem jó ", main, s4.getSzoveg());

        SzerkeszthetoDokumentum s5 = new SzerkeszthetoDokumentum(main);
        s5.beszur(0, uj);
        assertEquals("A beszur() nem jó ", pozNull, s5.getSzoveg());

        SzerkeszthetoDokumentum s6 = new SzerkeszthetoDokumentum(main);
        s6.beszur(12, uj);
        assertEquals("A beszur() nem jó ", pozTwelve, s6.getSzoveg());
    }
    
    @Test
    public void torolTest(){
        String main = "Autó légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";
        
        SzerkeszthetoDokumentum s1 = new SzerkeszthetoDokumentum(main);
        s1.torol(0, 0);
        assertEquals("A torol() nem jó", main, s1.getSzoveg());
        
        SzerkeszthetoDokumentum s2 = new SzerkeszthetoDokumentum(main);
        s2.torol(0, 4);
        assertEquals("A torol() nem jó"," légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró", s2.getSzoveg());
        
        SzerkeszthetoDokumentum s22 = new SzerkeszthetoDokumentum(main);
        s22.torol(0, 15);
        assertEquals("A torol() nem jó","cska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró", s22.getSzoveg());
        
        SzerkeszthetoDokumentum s3 = new SzerkeszthetoDokumentum(main);
        s3.torol(-1, 4);
        assertEquals("A torol() nem jó", main, s3.getSzoveg());
        
        SzerkeszthetoDokumentum s4 = new SzerkeszthetoDokumentum(main);
        s4.torol(125, 3);
        assertEquals("A torol() nem jó", main,s3.getSzoveg());
        
        SzerkeszthetoDokumentum s5 = new SzerkeszthetoDokumentum(main);
        s5.torol(2, 125);
        assertEquals("A torol() nem jó", main, s5.getSzoveg());
        
        SzerkeszthetoDokumentum s6 = new SzerkeszthetoDokumentum(main);
        s6.torol(2, -3);
        assertEquals("A torol() nem jó", main, s6.getSzoveg());
        
        SzerkeszthetoDokumentum s7 = new SzerkeszthetoDokumentum(main);
        s7.torol(15, 5);
        assertEquals("A torol() nem jó", "Autó légzsák ma"
                + "alma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró", s7.getSzoveg());
    }

}
