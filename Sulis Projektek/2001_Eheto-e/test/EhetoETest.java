
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import pkg2001_ehetoe.Aru;
import pkg2001_ehetoe.Ehetoe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author gaborT
 */
public class EhetoETest {

    public EhetoETest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
    DateTimeFormatter form1 = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm");

    LocalDateTime lejarat = LocalDateTime.now().plusDays(2).withHour(23).withMinute(59).withSecond(0).withNano(0);
    LocalDateTime lejarat1 = LocalDateTime.now().minusDays(11).withHour(23).withMinute(59).withSecond(0).withNano(0);
    String lejarat2 = lejarat.toLocalDate().format(form);
    String lejarat3 = lejarat1.toLocalDate().format(form);
    LocalDateTime felbontas1 = LocalDateTime.now().minusDays(1).withHour(14).withMinute(0).withSecond(0).withNano(0);
    LocalDateTime felbontas2 = LocalDateTime.now().minusDays(5).withHour(12).withMinute(0).withSecond(0).withNano(0);
    String felbontas3 = LocalDateTime.now().minusDays(2).withHour(14).withMinute(35).format(form1);
    String felbontas4 = LocalDateTime.now().minusDays(4).withHour(14).withMinute(35).format(form1);
    String felbontas5 = LocalDateTime.now().plusDays(6).withHour(0).withMinute(01).format(form1);

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }
    Aru vaj;
    Aru sajt;
    Aru tej;

    @After
    public void tearDown() {
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void kontruktorTest() {
        vaj = new Aru(lejarat);
        assertEquals("A param. konstruktor nem jól működik", lejarat, vaj.getLejarat());

    }

    @Test
    public void felbontasControllTest() {
        //Rossz formátumú bevitel
        
        exit.expectSystemExit();
        assertNull("A lejarat nem Null '-' esetén", vaj.felbontasControll("-"));
        assertEquals("Nem megfelelő formátum.", vaj.felbontasControll("2019.10.12. 12.00"));
        
        //Jó formátumú bevitel
        assertEquals("A formátumellenőrzés nem jó megfelelő fomrátum esetén", felbontas2, tej.felbontasControll("2019.10.12. 12:00"));

    }

    @Test
    public void getterTest() {
        sajt = new Aru();
        //tej = new Aru(lejarat2);
        assertNull("A getLejarat() nem null-t ad vissza", sajt.getLejarat());
        assertEquals("A getLejarat() nem helyes dátumot ad vissza", lejarat, tej.getLejarat());
    }

    @Test
    public void setterTest() {
        vaj = new Aru();
        //vaj.setFelbontas(felbontas4);
        assertEquals("A setFelbontas() nem működik jól üres kontruktor esetén", felbontas2, vaj.getFelbontas());

        //sajt = new Aru(lejarat3);
        //sajt.setFelbontas("-");
        assertNull("A setFelbontas() nem Null-t allít be.", sajt.getFelbontas());

        exit.expectSystemExit();
        //tej = new Aru();
       // tej.setFelbontas("2020-08-17 15:15");
        assertNull("A setFelbontas() nem null-t állít be rossz fromátum esetén", tej.getFelbontas());
        assertEquals("Nem megfelelő formátum.", tej.toString());
    }

    @Test
    public void bontatlanVizsgalatTest() {
        //sajt = new Aru(lejarat2);
        //sajt.setFelbontas("-");
        assertNull("A felbontas-nak nem null az értéke", sajt.getFelbontas());
        assertEquals("Az ehete() nem jó felbontatlan terméknél", true, sajt.eheto(LocalDateTime.now()));

        //tej = new Aru(lejarat3);
        //.setFelbontas("-");
        assertNull("A felbontas-nak nem null az értéke", tej.getFelbontas());
        assertEquals("Az ehete() nem jó felbontatlan terméknél ha már lejárt", false, tej.eheto(LocalDateTime.now()));

    }

    @Test
    public void bontottViszgalatTest() {
        //sajt = new Aru(lejarat2);
        //sajt.setFelbontas(felbontas3);
        assertEquals("Az ehete() nem jól vizsgál bontott terméknél", true, sajt.eheto(LocalDateTime.now()));

        //tej = new Aru(lejarat2);
       // tej.setFelbontas(felbontas4);
        assertEquals("Az ehetoe() nem jól vizsgál bontott terméknél ha már lejárt", false, tej.eheto(LocalDateTime.now()));
    }

}
