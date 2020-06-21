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
public class DokumentumTest {

    

    public DokumentumTest() {
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
        Dokumentum d = new Dokumentum();
        assertNull("A def. kontr. nem jól működik", d.getSzoveg());
    }

    @Test
    public void constructorParamTest() {
        Dokumentum d1 = new Dokumentum("");
        assertEquals("A paraméteres konstruktor nem üres Stringet ad vissza", "", d1.getSzoveg());

        String a = "Autó légzsák macska"
                + "\nalma alma csirkefarhát"
                + "\nvár város városokban"
                + "\nházikó házikó mogyoró";
        
        Dokumentum d2 = new Dokumentum(a);
        assertEquals("A param. konstruktor nem jól működik", a, d2.getSzoveg());
        
        Dokumentum d3= new Dokumentum(null);
        assertEquals("A param. konst. null Stringet ad vissza", "", d3.getSzoveg());
        
    }

    @Test
    public void getHosszTest() {
        Dokumentum d1 = new Dokumentum("");
        assertEquals("A függvény nem 0 ad vissza", 0, d1.getHossz());

        String a = "Autó légzsák macska\nalma alma csirkefarhát\nvár város városokban\n"
                + "házikó házikó mogyoró";
        Dokumentum d2 = new Dokumentum(a);
        assertEquals("A getHossz nem jó számot ad vissza", a.length(), d2.getHossz());

    }

    @Test
    public void getSorokSzamaTest() {
        Dokumentum d1 = new Dokumentum("");
        assertEquals("A függvény nem 1 ad vissza", 1, d1.getSorokSzama());

        String a = "Autó légzsák macska\n"
                + "alma alma csirkefarhát\n"
                + "vár város városokban\n"
                + "házikó házikó mogyoró";
        Dokumentum d2 = new Dokumentum(a);
        assertEquals("A getHossz nem jó számot ad vissza", 4, d2.getSorokSzama());
    }

    @Test
    public void getSorTest() {
        String a = "Autó légzsák macska\n"
                + "alma alma csirkefarhát\n"
                + "vár város városokban\n"
                + "házikó házikó mogyoró";

        Dokumentum d1 = new Dokumentum("");
        assertEquals("", d1.getSor(0));

        Dokumentum d2 = new Dokumentum(a);
        assertEquals("Nem a harmadik sort adja vissza", "vár város városokban", d2.getSor(2));

        Dokumentum d3 = new Dokumentum(a);
        assertEquals("Nem az első sort adja vissza", "Autó légzsák macska", d3.getSor(0));
    }

    public void szerkeszthetoValtozattest() {
        String a = "Autó légzsák macska\n"
                + "alma alma csirkefarhát\n"
                + "vár város városokban\n"
                + "házikó házikó mogyoró";

        Dokumentum d1 = new Dokumentum();
        assertEquals(new SzerkeszthetoDokumentum(), d1.szerkeszthetoValtozat());

        Dokumentum d2 = new Dokumentum(a);
        assertEquals(new SzerkeszthetoDokumentum(a), d1.szerkeszthetoValtozat());
    }

}
