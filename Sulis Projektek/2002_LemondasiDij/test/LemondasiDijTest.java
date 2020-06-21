
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import java.time.LocalDateTime;
import java.time.Month;
import pkg2002_lemondasidij.Szallas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

public class LemondasiDijTest {

    Szallas szallo = null;

    public LemondasiDijTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }
    LocalDateTime erkezes = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 50, 10, 0);
    LocalDateTime erkezes1 = LocalDateTime.of(2019, Month.AUGUST, 15, 0, 0, 0, 0);
    LocalDateTime erkezes2 = LocalDateTime.of(2019, Month.AUGUST, 15, 14, 0, 0, 0);

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        szallo = new Szallas();
    }

    @After
    public void tearDown() {
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void konstruktorTest() {
        szallo = new Szallas(erkezes);
        assertEquals("A param. konstr. nem jól állít be", erkezes2, szallo.getErkezes());
    }

    @Test
    public void setterTest() {
        szallo.setErkezes(erkezes2);
        assertEquals("A setter nem jól állítja be az érkezést", erkezes2, szallo.getErkezes());
    }

    @Test
    public void nullParsingTest() {
        exit.expectSystemExit();
        assertNull("Az fromátumellenörzés nem null-t dob vissza rossz formátum esetén", szallo.inputControll("2019-12-01"));
    }

    @Test
    public void parsingTest() {
        szallo.setErkezes(szallo.inputControll("2019.08.15."));
        assertEquals("A formátumellenörzés nem jól működik jó formátum esetén", erkezes2, szallo.getErkezes());

    }

    @Test
    public void isWeekendTest() {
        assertTrue("Az isWeekend függvény nem jól működik vasárnappal.",
                szallo.isWeekend(LocalDateTime.of(2019, Month.NOVEMBER, 3, 23, 59)));

        assertTrue("Az isWeekend függvény nem jól működik szombattal.",
                szallo.isWeekend(LocalDateTime.of(2019, Month.NOVEMBER, 2, 14, 0)));

        assertTrue("Az isWeekend függvény nem jól működik szombattal.",
                szallo.isWeekend(LocalDateTime.of(2019, Month.NOVEMBER, 2, 0, 1)));

        assertFalse("Az isWeekend függvény nem jól működik péntekkel.",
                szallo.isWeekend(LocalDateTime.of(2019, Month.NOVEMBER, 1, 23, 59)));

        assertFalse("Az isWeekend függvény nem jól működik hétfővel.",
                szallo.isWeekend(LocalDateTime.of(2019, Month.NOVEMBER, 4, 0, 1)));
    }

    @Test
    public void visszajaroTest1() {
        szallo.setErkezes(LocalDateTime.now().plusHours(23));
        assertEquals("A getVisszajaroSzazalék nem jó értéket ad vissza 24 órán belűl.",
                0, szallo.getVisszajaroSzazalek((LocalDateTime.now().withHour(14).withMinute(1))));

    }

    @Test
    public void visszajarTest2() {
        Szallas szallo1 = new Szallas(LocalDateTime.of(2019, Month.OCTOBER, 12, 14, 0));
        
        assertEquals("Pont három munkanappal előbbi lemondásnál, 14 óra előtt vizsgálva.",
                90, szallo1.getVisszajaroSzazalek(LocalDateTime.of(2019, Month.OCTOBER, 9, 13, 0)));

    }
    
    

}
