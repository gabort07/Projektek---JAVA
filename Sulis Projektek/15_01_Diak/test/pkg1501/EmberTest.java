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
 * @author gaborT
 */
public class EmberTest {

    private Ember ember;

    public EmberTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ember = new Ember();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void defKonstruktorTeszt() {
        Ember e = new Ember();
        assertNull("Az alapértelmezett konstruktor nem jól állítja be a nevet.", e.getNev());
        assertEquals("Az alapértelmezett konstruktor nem jól állítja be a születési évet.", 0, e.getSzulEv());

    }

    @Test
    public void paramKonstruktorTeszt() {
        String a = "Gipsz Jakab";
        int b = 1990;
        Ember e = new Ember(a, b);
        assertEquals("A konstruktor nem jól állítja be a nevet.", a, e.getNev());
        assertEquals("A konstruktor nem jól állíta be a születési évet", b, e.getSzulEv());
    }

    @Test
    public void getterTeszt() {
        Ember e = new Ember("Esmint Sánor", 1880);
        assertEquals("A név getter nem működik jól", "Esmint Sánor", e.getNev());
        assertEquals("A szül. év getter nem működik jól", 1880, e.getSzulEv());
    }
    
    @Test
    public void kiirTeszt(){
    Ember e = new Ember("Gipsz Jakab", 1990);
    assertEquals("A kiir függvény nem működik jól", "Gipsz Jakab (1990)", e.toString());
    }

}
