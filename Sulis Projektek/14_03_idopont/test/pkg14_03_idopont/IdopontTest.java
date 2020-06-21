/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_03_idopont;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabor
 */
public class IdopontTest {

    private Idopont idopont;

    public IdopontTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        idopont = new Idopont();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konsturktorGetterTeszt() {
        Idopont i = new Idopont(15, 31, 15);
        assertEquals(15, i.getOra());
        assertEquals(31, i.getPerc());
        assertEquals(15, i.getMasodperc());

        Idopont i1 = new Idopont(0, 0, 0);
        assertEquals(0, i1.getOra());
        assertEquals(0, i1.getPerc());
        assertEquals(0, i1.getMasodperc());
    }

    @Test
    public void setterGetterTesz() {
        Idopont i = new Idopont();
        i.setOra(0);
        i.setPerc(0);
        i.setMasodperc(0);
        assertEquals(0, i.getOra());
        assertEquals(0, i.getPerc());
        assertEquals(0, i.getMasodperc());

        Idopont i2 = new Idopont();
        i2.setOra(16);
        i2.setPerc(55);
        i2.setMasodperc(36);
        assertEquals(16, i2.getOra());
        assertEquals(55, i2.getPerc());
        assertEquals(36, i2.getMasodperc());
    }
    
     @Test
    public void atvaltMasodpercPercTeszt1() {
        Idopont i = new Idopont(21, 34, 59);
        i.novelMp();
        assertEquals("A percnek 35-nek kell lenni", 35, i.getPerc());
        assertEquals("A másodpercnek 0-nak kell lenni", 0, i.getMasodperc());
    }

    @Test
    public void atvaltMasodpercPercTeszt2() {
        Idopont i = new Idopont(11, 55, 45);
        i.setMasodperc(70);
        assertEquals("A percnek 56-nak kell lenni", 56, i.getPerc());
        assertEquals("A másodpercnek 10-nek kell lenni", 10, i.getMasodperc());
    }

    @Test
    public void novelTesztek() {
        Idopont i = new Idopont(3, 20, 15);
        i.novelMp();
        i.novelMp();
        i.novelPerc();
        i.novelPerc();
        i.novelOra();
        i.novelOra();
        assertEquals("A másodpercnek 17-nek kell lenni", 17, i.getMasodperc());
        assertEquals("A percnek 22-nek kell lenni", 22, i.getPerc());
        assertEquals("Az órának 5-nek kell lenni", 5, i.getOra());
    }
    
    @Test
    public void novelTesztek1() {
        Idopont i = new Idopont(21, 57, 58);
        i.novelMp();
        i.novelMp();
        i.novelPerc();
        i.novelPerc();
        i.novelOra();
        i.novelOra();
        assertEquals("A másodpercnek 0-nek kell lenni", 0, i.getMasodperc());
        assertEquals("A percnek 0-nek kell lenni", 0, i.getPerc());
        assertEquals("Az órának 0-nek kell lenni", 0, i.getOra());
    }

   

    @Test
    public void atvaltMasodpercPercTeszt3() {
        Idopont i = new Idopont(0, 0, 0);
        i.setMasodperc(350);
        assertEquals("A percnek 5-nek kell lenni", 5, i.getPerc());
        assertEquals("A másodpercnek 50-nek kell lenni", 50, i.getMasodperc());
    }

    @Test
    public void atvaltMasodpercPercOraTeszt() {
        Idopont i = new Idopont(0, 0, 0);
        i.setMasodperc(7280);
        assertEquals("Az órának 2-nek kell lenni", 2, i.getOra());
        assertEquals("A percnek 1-nek kell lenni", 1, i.getPerc());
        assertEquals("A másodpercnek 20-nak kell lenni", 20, i.getMasodperc());
    }

    @Test
    public void atvaltPercOraTeszt() {
        Idopont i = new Idopont(0, 0, 0);
        i.setPerc(3020);
        assertEquals("Az órának 2-nek kell lenni", 2, i.getOra());
        assertEquals("A percnek 20-nak kell lenni", 20, i.getPerc());
        assertEquals("A másodpercnek 0-nak kell lenni", 0, i.getMasodperc());
    }

    @Test
    public void atvaltMinuszOraPercTeszt() {
        Idopont i = new Idopont(0, 1, 1);
        i.setOra(-2);
        i.setPerc(-2);
        assertEquals("Az órának 22-nek kell lenni", 21, i.getOra());
        assertEquals("A percnek 58-nak kell lenni", 58, i.getPerc());
    }

    @Test
    public void atvaltMinuszMasodpercTeszt1() {
        Idopont i = new Idopont(0, 0, 0);
        i.setMasodperc(-250);
        assertEquals("Az órának 23-nak kell lenni", 23, i.getOra());
        assertEquals("A percnek 55-nek kell lenni", 55, i.getPerc());
        assertEquals("A másodpercnek 50-nek kell lenni", 50, i.getMasodperc());
    }

    @Test
    public void atvaltMinuszMasodpercTeszt2() {
        Idopont i = new Idopont(0, 0, 0);
        i.setMasodperc(-181218);
        assertEquals("Az órának 21-nek kell lenni", 21, i.getOra());
        assertEquals("A percnek 39-nek kell lenni", 39, i.getPerc());
        assertEquals("A másodpercnek 42-nek kell lenni", 42, i.getMasodperc());
    }
}

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}

