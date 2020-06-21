/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeromain;

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
public class HomeroTest {

    public HomeroTest() {
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
    public void createTest() {
        Homero uj = new Homero(45);
        assertEquals("Nem OK: A 45-tel létrehozott hőmérő nem 45 fokot ad "
                + "vissza a getCelsius() - szal.", 45, uj.getCelsius(), 1e-5);
        if (uj.getCelsius() != 45) {
            fail("Nem OK: A 45-tel létrehozott hőmérő"
                    + " nem 45 fokot ad vissza a getCelsius() - szal.");
        }
        assertEquals(
                "Nem OK: A 45-tel létrehozott hőmérő nem 113 fokot ad vissza"
                + " a getFahrenheit() - tel.", 113, uj.getFahrenheit(), 1e-5);
    }

    @Test
    public void forrasPontTest1() {
        assertEquals("Nem OK: A FORRASPONT kezdeti értéke nem 100.", 100, Homero.FORRASPONT, 1e-5);
        Homero h = Homero.forraspont();
        assertEquals("Nem OK: A forraspont() metódussal létrehozott Homero "
                + "nem 100 Clesius-fokot mutat.", 100, h.getCelsius(), 1e-5);
        Homero.FORRASPONT = 150;
        assertEquals("Nem OK: A FORRASPONT új értéke nem 150.", 150,
                Homero.FORRASPONT, 1e-5);
        Homero h2 = Homero.forraspont();
        assertEquals("Nem OK: A forraspont() metódussal létrehozott második "
                + "Homero nem 150 Celsius-fokot mutat.", 150, h2.getCelsius(), 1e-5);
        assertEquals("Nem OK: Az első hőmérőnek nem szabad a hőmérsékletét "
                + "megváltoztatnia.", 100, h.getCelsius(), 1e-5);
    }
}
