/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1401_amoba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dániel
 */
public class TablaTeszt {
    
    private Tabla tabla;
    
    public TablaTeszt() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tabla = new Tabla();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void konstansTeszt() {
        assertEquals(0, Tabla.URES);
        assertEquals(1, Tabla.JATEKOS_1);
        assertEquals(2, Tabla.JATEKOS_2);
    }

    @Test
    public void letrehozasTeszt() {
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(0, 0)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(0, 1)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(0, 2)));
        
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(1, 0)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(1, 1)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(1, 2)));
        
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(2, 0)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(2, 1)));
        assertEquals("A tábla nem üresen jött létre", Tabla.URES, tabla.getMezo(new Pozicio(2, 2)));
    }
    
    @Test
    public void felteszTeszt1() {
        Pozicio pozi = new Pozicio(0,0);
        tabla.feltesz(pozi, Tabla.JATEKOS_1);
        assertEquals(Tabla.JATEKOS_1, tabla.getMezo(pozi));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 2)));
    }
    
    @Test
    public void felteszTeszt2() {
        Pozicio pozi = new Pozicio(0,1);
        tabla.feltesz(pozi, Tabla.JATEKOS_2);
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 0)));
        assertEquals(Tabla.JATEKOS_2, tabla.getMezo(pozi));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 2)));
    }
    
    @Test
    public void felteszTeszt3() {
        Pozicio pozi = new Pozicio(-1,0);
        tabla.feltesz(pozi, Tabla.JATEKOS_1);
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 2)));
    }
    
    @Test
    public void felteszTeszt4() {
        Pozicio pozi = new Pozicio(0,0);
        tabla.feltesz(pozi, 3); // se nem egyes, se nem kettes játékos
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(0, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(1, 2)));
        
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 0)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 1)));
        assertEquals(Tabla.URES, tabla.getMezo(new Pozicio(2, 2)));
    }
    
    
    @Test
    public void uresTablaHelyesTeszt() {
        assertFalse(tabla.helyes(new Pozicio(-1, 0)));
        assertFalse(tabla.helyes(new Pozicio(0, -1)));
        assertFalse(tabla.helyes(new Pozicio(0, 3)));
        assertFalse(tabla.helyes(new Pozicio(1, 3)));
        assertFalse(tabla.helyes(new Pozicio(2, 3)));
        assertFalse(tabla.helyes(new Pozicio(3, 3)));
        assertFalse(tabla.helyes(new Pozicio(3, 2)));
        assertFalse(tabla.helyes(new Pozicio(3, 1)));
        assertFalse(tabla.helyes(new Pozicio(3, 0)));

        assertTrue(tabla.helyes(new Pozicio(0, 0)));
        assertTrue(tabla.helyes(new Pozicio(0, 1)));
        assertTrue(tabla.helyes(new Pozicio(0, 2)));
        
        assertTrue(tabla.helyes(new Pozicio(1, 0)));
        assertTrue(tabla.helyes(new Pozicio(1, 1)));
        assertTrue(tabla.helyes(new Pozicio(1, 2)));
        
        assertTrue(tabla.helyes(new Pozicio(2, 0)));
        assertTrue(tabla.helyes(new Pozicio(2, 1)));
        assertTrue(tabla.helyes(new Pozicio(2, 2)));
    }
    
    @Test
    public void nemUresTablaHelyesTeszt1() {
        Pozicio pozi = new Pozicio(1,2);
        assertTrue(tabla.helyes(pozi));
        tabla.feltesz(pozi, Tabla.JATEKOS_1);
        assertFalse(tabla.helyes(pozi));
    }

    @Test
    public void nemUresTablaHelyesTeszt2() {
        Pozicio pozi = new Pozicio(2,1);
        assertTrue(tabla.helyes(pozi));
        tabla.feltesz(pozi, Tabla.JATEKOS_2);
        assertFalse(tabla.helyes(pozi));
    }
    
	@Test
    public void nyert1Fuggo1Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1Fuggo2Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 1), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1Fuggo3Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 2), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1Vizszintes1Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(0, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1Vizszintes2Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(1, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 2), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1Vizszintes3Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }

	@Test
    public void nyert1FoatloTeszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
	@Test
    public void nyert1MellekatloTeszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_1));
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_1);
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_1);
        assertTrue(tabla.nyert(Tabla.JATEKOS_1));
    }
    
    @Test
	public void nyert2Fuggo1Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
    @Test
	public void nyert2Fuggo2Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 1), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
    @Test
	public void nyert2Fuggo3Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 2), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
	@Test
    public void nyert2Vizszintes1Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(0, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
	@Test
    public void nyert2Vizszintes2Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(1, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
	@Test
    public void nyert2Vizszintes3Teszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }

	@Test
    public void nyert2FoatloTeszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
	@Test
    public void nyert2MellekatloTeszt() {
        assertFalse(tabla.nyert(Tabla.JATEKOS_2));
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_2);
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_2);
        assertTrue(tabla.nyert(Tabla.JATEKOS_2));
    }
    
	@Test
    public void dontetlenTeszt() {
        /*
        121
        212
        212
        */
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(0, 0), Tabla.JATEKOS_1);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(0, 1), Tabla.JATEKOS_2);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(0, 2), Tabla.JATEKOS_1);
        assertFalse(tabla.dontetlen());
        
        tabla.feltesz(new Pozicio(1, 0), Tabla.JATEKOS_2);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(1, 1), Tabla.JATEKOS_1);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(1, 2), Tabla.JATEKOS_2);
        assertFalse(tabla.dontetlen());
        
        tabla.feltesz(new Pozicio(2, 0), Tabla.JATEKOS_2);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(2, 1), Tabla.JATEKOS_1);
        assertFalse(tabla.dontetlen());
        tabla.feltesz(new Pozicio(2, 2), Tabla.JATEKOS_2);
        assertTrue(tabla.dontetlen());
    }
    
}
