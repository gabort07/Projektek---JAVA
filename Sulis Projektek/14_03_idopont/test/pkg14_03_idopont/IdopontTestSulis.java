//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.Random;
//
//public class IdopontTest {
//	
//	private Idopont idopont;
//	private Random gener;
//	
//    @Before
//    public void init() {
//		idopont = new Idopont();
//		gener = new Random();
//    }
//    
//    @Test
//    public void testDefConstructor() {
//		Idopont idopont = new Idopont();
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az ora �rt�k�t!", 0, idopont.getOra());
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az perc �rt�k�t!", 0, idopont.getPerc());
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az masodperc �rt�k�t!", 0, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testParamConstructor() {
//		int o = gener.nextInt(24);
//		int p = gener.nextInt(60);
//		int m = gener.nextInt(60);
//		Idopont idopont = new Idopont(o, p, m);
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az ora �rt�k�t!", o, idopont.getOra());
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az perc �rt�k�t!", p, idopont.getPerc());
//		assertEquals("Az alap�rtelmezett konstruktor nem j�l �ll�tja be az masodperc �rt�k�t!", m, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testGetters() {
//        String msg = "A getterek nem m�k�dnek j�l.";
//		Idopont idopont = new Idopont(12, 12, 44);
//		assertEquals(msg, 12, idopont.getOra());
//		assertEquals(msg, 12, idopont.getPerc());
//		assertEquals(msg, 44, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testNincsValtas() {
//        String msg = "�tv�lt�s n�lk�li m�sodpercn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 12, 12);
//		idopont.novelMp();
//		assertEquals(msg, 12, idopont.getOra());
//		assertEquals(msg, 12, idopont.getPerc());
//		assertEquals(msg, 13, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testMasodpercPercValtas() {
//        String msg = "A percet is �rint� m�sodpercn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 12, 59);
//		idopont.novelMp();
//		assertEquals(msg, 12, idopont.getOra());
//		assertEquals(msg, 13, idopont.getPerc());
//		assertEquals(msg, 0, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testMasodpercPercOraValtas() {
//        String msg = "Az �r�t is �rint� m�sodpercn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 59, 59);
//		idopont.novelMp();
//		assertEquals(msg, 13, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 0, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testMasodpercPercOraNapValtas() {
//        String msg = "A napot is �rint� m�sodpercn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(23, 59, 59);
//		idopont.novelMp();
//		assertEquals(msg, 0, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 0, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testPercValtas() {
//        String msg = "A csak percet �rint� percn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 23, 11);
//		idopont.novelPerc();
//		assertEquals(msg, 12, idopont.getOra());
//		assertEquals(msg, 24, idopont.getPerc());
//		assertEquals(msg, 11, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testPercOraValtas() {
//        String msg = "Az �r�t is �rint� percn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 59, 34);
//		idopont.novelPerc();
//		assertEquals(msg, 13, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 34, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testPercOraNapValtas() {
//        String msg = "A napot is �rint� percn�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(23, 59, 16);
//		idopont.novelPerc();
//		assertEquals(msg, 0, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testOraValtas() {
//        String msg = "A t�lcsordul�s n�lk�li �ran�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(12, 29, 34);
//		idopont.novelOra();
//		assertEquals(msg, 13, idopont.getOra());
//		assertEquals(msg, 29, idopont.getPerc());
//		assertEquals(msg, 34, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testOraNapValtas() {
//        String msg = "A napot is �rint� �ran�vel�sre nem m�k�dik j�l.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.novelOra();
//		assertEquals(msg, 0, idopont.getOra());
//		assertEquals(msg, 34, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetMasodperc() {
//        String msg = "A setMasodperc() nem m�k�dik j�l, ha nincs �tv�lt�s.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setMasodperc(34);
//		assertEquals(msg, 23, idopont.getOra());
//		assertEquals(msg, 34, idopont.getPerc());
//		assertEquals(msg, 34, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetMasodpercPerc() {
//        String msg = "A setMasodperc() nem m�k�dik j�l, ha percet is �rinti a v�lt�s.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setMasodperc(78);
//		assertEquals(msg, 23, idopont.getOra());
//		assertEquals(msg, 35, idopont.getPerc());
//		assertEquals(msg, 18, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetMasodpercDuplaPerc() {
//        String msg = "A setMasodperc() nem m�k�dik j�l, ha a m�sodperc �rt�k 2 vagy ann�l t�bb percet jelent.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setMasodperc(158);
//		assertEquals(msg, 23, idopont.getOra());
//		assertEquals(msg, 36, idopont.getPerc());
//		assertEquals(msg, 38, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetMasodpercOra() {
//        String msg = "A setMasodperc() nem m�k�dik j�l, ha a m�sodperc �rt�k �tv�ltva az �r�t is �rinti.";
//		Idopont idopont = new Idopont(22, 34, 16);
//		idopont.setMasodperc(1571);
//		assertEquals(msg, 23, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 11, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetMasodpercNap() {
//        String msg = "A setMasodperc() nem m�k�dik j�l, ha a m�sodperc �rt�k �tv�ltva a napot is �rinti.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setMasodperc(1571);
//		assertEquals(msg, 0, idopont.getOra());
//		assertEquals(msg, 0, idopont.getPerc());
//		assertEquals(msg, 11, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetPerc() {
//        String msg = "A setPerc() nem m�k�dik j�l, ha csak a percet �rinti a v�lt�s.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setPerc(22);
//		assertEquals(msg, 23, idopont.getOra());
//		assertEquals(msg, 22, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetPercOra() {
//        String msg = "A setPerc() nem m�k�dik j�l, ha a perc �rt�k t�bb, mint egy �r�t jelent.";
//		Idopont idopont = new Idopont(20, 55, 16);
//		idopont.setPerc(66);
//		assertEquals(msg, 21, idopont.getOra());
//		assertEquals(msg, 6, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetPercDuplaOra() {
//        String msg = "A setPerc() nem m�k�dik j�l, ha a perc �rt�k t�bb, mint k�t �r�t jelent.";
//		Idopont idopont = new Idopont(20, 55, 16);
//		idopont.setPerc(126);
//		assertEquals(msg, 22, idopont.getOra());
//		assertEquals(msg, 6, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetPercNap() {
//        String msg = "A setPerc() nem m�k�dik j�l, ha a perc �rt�k �tv�ltva a napot is �rinti.";
//		Idopont idopont = new Idopont(22, 34, 16);
//		idopont.setPerc(130);
//		assertEquals(msg, 0, idopont.getOra());
//		assertEquals(msg, 10, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }
//    
//    @Test
//    public void testSetOra() {
//        String msg = "A setOra() nem m�k�dik j�l, ha az �ra �rt�k �t�ll�t�sa nem �rint m�s �rt�ket.";
//		Idopont idopont = new Idopont(23, 34, 16);
//		idopont.setOra(11);
//		assertEquals(msg, 11, idopont.getOra());
//		assertEquals(msg, 34, idopont.getPerc());
//		assertEquals(msg, 16, idopont.getMasodperc());
//    }	
//}