/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.time.Month;
import pkg2003_vakacio.Iskola;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author gaborT
 */
public class VakacioTest {

    public VakacioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    LocalDate elsoNap = LocalDate.of(2019, Month.DECEMBER, 1);
    LocalDate kezd = LocalDate.of(2020, Month.JANUARY, 13);
    LocalDate vege = LocalDate.of(2020, Month.JANUARY, 22);
    LocalDate kezd1 = LocalDate.of(2020, Month.MARCH, 1);
    LocalDate vege1 = LocalDate.of(2020, Month.MARCH, 9);

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    Iskola iskola = new Iskola();

    @After
    public void tearDown() {
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void setterGetterTest() {

        iskola.setVakacioElsoNapja(LocalDate.of(2019, Month.DECEMBER, 1));
        assertEquals("A setter nem jól állítja be az első napot, vagy getter nem jó adatot olvas ki.",
                elsoNap, iskola.getVakacioElsoNapja());
    }

    @Test
    public void konstruktorTest() {

        assertNull("A def. konstruktor nem NULL-t állít be.", iskola.getVakacioElsoNapja());

        iskola = new Iskola(LocalDate.of(2019, Month.DECEMBER, 1));
        assertEquals("A param. konstruktor nem jó dátumot állít be az adattagnak",
                elsoNap, iskola.getVakacioElsoNapja());
    }

    @Test
    public void stringToDateTest() {

        assertEquals("A fromátumbeállítás nem működik, megfelelő formátum esetén",
                elsoNap, iskola.stringToDate("2019.12.01."));

        assertNull("Az ellenörző nem null-t ad vissza '-' bevitelnél.", iskola.stringToDate("-"));

        exit.expectSystemExit();
        assertNull("Rossz formátum esetén nem NULL-t dob és nem lép ki.", iskola.stringToDate("2019-12-1"));
    }

    @Test
    public void isWeekendTest() {
        assertTrue("Az isWeekend nem igazat ad vissza vasárnappal",
                iskola.isWeekend(LocalDate.of(2019, Month.NOVEMBER, 3)));

        assertTrue("Az isWeekend nem igazat ad vissza szombattal",
                iskola.isWeekend(LocalDate.of(2019, Month.NOVEMBER, 2)));

        assertFalse("Az isWeekend nem hamisat ad vissza péntekkel",
                iskola.isWeekend(LocalDate.of(2019, Month.NOVEMBER, 1)));

        assertFalse("Az isWeekend nem hamisat ad vissza hétfővel",
                iskola.isWeekend(LocalDate.of(2019, Month.NOVEMBER, 4)));
    }

//    @Test
//    public void addSzunetTest1() {
//        iskola.setVakacioElsoNapja(iskola.stringToDate("2020.03.01."));
//        iskola.addSzunet(iskola.stringToDate("2020.01.13."), iskola.stringToDate("2020.01.20."));
//        assertEquals("Az addSzunet nem jól számolja ki a napokat", 5, iskola.getSzunet());
//    }
    @Test
    public void addSzunetTest2() {
        //Amikor a szünet első napját a bekerSzunet() a mai napra állítja mert nem kell vele számolni
        iskola.setVakacioElsoNapja(iskola.stringToDate("2020.03.01."));
        iskola.addSzunet(LocalDate.now(), iskola.stringToDate("2019.01.20."));
        assertEquals("Az addSzunet nem jól számolja ki a napokat", 0, iskola.getSzunet());
    }

    @Test
    public void athelyezMunkanapTest1() {
        //Amikor a szünet és a ledolgozandó is előttünk van
        iskola.athelyezMunkanap(LocalDate.of(2019, 12, 27), LocalDate.of(2019, 12, 21));
        assertEquals("Az athelyezMunkanap nem jól helyezi át a munkanapot!", 0, iskola.getSzunet());
    }

    @Test
    public void athelyezMunkanapTest2() {
        //Amikor csak a ledolgozandó még előttünk van
        iskola.athelyezMunkanap(LocalDate.of(2019, 10, 27), LocalDate.of(2019, 12, 21));
        assertEquals("Az athelyezMunkanap nem jól helyezi át a munkanapot!", -1, iskola.getSzunet());
    }

    @Test
    public void athelyezMunkanapTest3() {
        //Amikor már ledolgoztuk
        iskola.athelyezMunkanap(LocalDate.of(2019, 10, 27), LocalDate.of(2019, 11, 21));
        assertEquals("Az athelyezMunkanap nem jól helyezi át a munkanapot!", 0, iskola.getSzunet());
    }

    @Test
    public void dayCounterTest() {
        assertEquals(71, iskola.daysBetweenExcludeWeekends(LocalDate.of(2019, Month.NOVEMBER, 1),
                LocalDate.of(2020, Month.FEBRUARY, 7)));
    }

    @Test
    public void getOtkatsiNapokTest1() {
        //amikor az szünetek száma 0
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.FEBRUARY, 7));
        assertEquals("A oktatási napok számát nem jól számolja a függvény",
                70, iskola.getOktatasiNapok(LocalDate.of(2019, Month.NOVEMBER, 1)));
    }

    @Test
    public void getOtkatsiNapokTest2() {
        //Amikor 13 nap szünet van
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.FEBRUARY, 7));
        iskola.setSzunet(13);
        assertEquals("A oktatási napok számát nem jól számolja a függvény",
                57, iskola.getOktatasiNapok(LocalDate.of(2019, Month.NOVEMBER, 1)));
    }

    @Test
    public void getOtkatsiNapokTest3() {
        //amikor az szünetek száma 0
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 6));
        assertEquals("A oktatási napok számát nem jól számolja a függvény",
                63, iskola.getOktatasiNapok(LocalDate.of(2019, Month.DECEMBER, 10)));
    }

    @Test
    public void getOtkatsiNapokTest4() {
        //Amikor egy szünet van, áthelyezett nap nincs
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 6));
        iskola.addSzunet(LocalDate.of(2020, Month.JANUARY, 6), LocalDate.of(2020, Month.JANUARY, 14));
        assertEquals("A metódus nem működik jól, az aktuális dátummal vizsgálva",
                56, iskola.getOktatasiNapok(LocalDate.now()));
    }

    @Test
    public void getOtkatsiNapokTest5() {
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 6));
        iskola.addSzunet(LocalDate.of(2019, Month.DECEMBER, 18), LocalDate.of(2019, Month.DECEMBER, 26));
        assertEquals("A  metódus nem működik jól, az aktuálistól eltérő dátummal vizsgálva,"
                + " ha a szünet kezdete és vége is a vizsgált nap előtt van.",
                43, iskola.getOktatasiNapok(LocalDate.of(2020, Month.JANUARY, 7)));
    }

    @Test
    public void getOtkatsiNapokTest6() {
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 9));
        iskola.addSzunet(LocalDate.of(2020, Month.JANUARY, 18), LocalDate.of(2020, Month.JANUARY, 23));
        assertEquals("A  metódus nem működik jól, az aktuális dátummal vizsgálva,"
                + " ha egy szünet van benne áthelyezett nap nincs.",
                60, iskola.getOktatasiNapok(LocalDate.now()));
    }

    @Test
    public void getOtkatsiNapokTest7() {
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.JUNE, 15));
        iskola.addSzunet(LocalDate.of(2019, Month.DECEMBER, 12), LocalDate.of(2020, Month.JANUARY, 3));
        assertEquals("A  metódus nem működik jól, az aktuálistól eltérő dátummal vizsgálva,"
                + " ha egy szünet van benne áthelyezett nap nincs.  Nem számolja jól a szüneteket,"
                + " ha a szünet kezdete és vége is a vizsgált nap után van."
                + " A tanév és a szünet is átnyúlik az éven.",
                187, iskola.getOktatasiNapok(LocalDate.of(2019, Month.SEPTEMBER, 3)));
    }

    @Test
    public void getOtkatsiNapokTest8() {
        //Amikor egy szünet van, áthelyezett nap nincs
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 9));
        iskola.addSzunet(LocalDate.of(2020, Month.JANUARY, 9), LocalDate.of(2020, Month.JANUARY, 17));
        assertEquals("A metódus nem működik jól, az aktuális dátummal vizsgálva",
                58, iskola.getOktatasiNapok(LocalDate.of(2019, Month.DECEMBER, 9)));
    }

    @Test
    public void getOtkatsiNapokTest9() {
        //Amikor egy szünet van, áthelyezett nap nincs
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 9));
        iskola.addSzunet(LocalDate.of(2020, Month.FEBRUARY, 10), LocalDate.of(2020, Month.FEBRUARY, 18));
        assertEquals("A metódus nem működik jól, az aktuális dátummal vizsgálva",
                295, iskola.getOktatasiNapok(LocalDate.of(2019, Month.JANUARY, 10)));
    }

    @Test
    public void getOktatasiNapokTest() {
        iskola.setVakacioElsoNapja(LocalDate.of(2020, Month.MARCH, 10));
        iskola.athelyezMunkanap(LocalDate.of(2020, Month.JANUARY, 16), LocalDate.of(2020, Month.JANUARY, 11));
        assertEquals("A metódus nem működik jól, az aktuálistól eltérő dátummal vizsgálva, "
                + "ha egy munkanap áthelyezés van benne",
                40, iskola.getOktatasiNapok(LocalDate.of(2020, Month.JANUARY, 11)));

    }
}
