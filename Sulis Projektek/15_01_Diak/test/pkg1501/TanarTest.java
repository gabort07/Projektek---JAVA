/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1501;

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
public class TanarTest {
    
    private Tanar tanar;
    
    public TanarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tanar=new Tanar();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void defKonstruktorTeszt(){
        Tanar t = new Tanar();
        assertNull("A default konstruktor nem jól állítja be a nevet.", t.getNev());
        assertEquals("A def konstruktor nem jól állítja be a születési évet.", 0, t.getSzulEv());
        assertEquals("A def konstruktor nem jól állítja be a tanított osztályokat.", 0, t.getTanOsztalyok());
        assertEquals("A def konstruktor nem jól állítja be a fitetést.", 0, t.getFizetes());
    }
    
    @Test
    public void mainKontruktorTeszt(){
        Tanar t=new Tanar("Gipsz Jakab", 1990, 5, 150000);
        assertEquals("A fő konstruktor nem jól állítja be nevet.", "Gipsz Jakab", t.getNev());
        assertEquals("A fő konstruktor nem jól állítja be suületési évet.", 1990,t.getSzulEv());
        assertEquals("A fő konstruktor nem jól állítja be tanított osztályok számát", 5,t.getTanOsztalyok());
        assertEquals("A fő konsEqualstruktor nem jól állítja be a fizetést.", 150000,t.getFizetes());
    }
    
    @Test
    public void setterGetterTeszt(){
        Tanar t= new Tanar();
        t.setNev("Marika");
        t.setSzulEv(1978);
        t.setTanOsztalyok(4);
        t.setFizetes(185000);
        assertEquals("Marika",t.getNev());
        assertEquals(1978,t.getSzulEv());
        assertEquals(4,t.getTanOsztalyok());
        assertEquals(185000,t.getFizetes());
        
    }
    
    @Test
    public void fizetestKapTeszt(){
        Tanar t =new Tanar();
        t.setFizetes(170000);
        assertEquals("Ma megkaptam a fizetésem, 170000 Ft-ot!", t.toString());
    }
    
//    @Test
//    public void tanitTeszt(){
//        Tanar t= new Tanar();
//        t.setTanOsztalyok(6);
//        assertEquals("Tanítom az egyik osztályomat. Összesen 6 osztályom van.",t);
//        ByteArrayOutputStream=
//    }

}
