/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dailycoding.Problem_101;

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
public class Problem_101Test {

    public Problem_101Test() {
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
    public void isPrimTest() {
        assertEquals("A prim ellenőrzés nem működik 1", true, Problem_101.isPrime(1));
        assertEquals("A prim ellenőrzés nem működik 2", true, Problem_101.isPrime(2));
        assertEquals("A prim ellenőrzés nem működik 3", true, Problem_101.isPrime(37));
        assertEquals("A prim ellenőrzés nem működik 4", true, Problem_101.isPrime(79));
        assertEquals("A prim ellenőrzés nem működik 5", false, Problem_101.isPrime(4));
        assertEquals("A prim ellenőrzés nem működik 6", false, Problem_101.isPrime(22));
        assertEquals("A prim ellenőrzés nem működik 7", false, Problem_101.isPrime(256));
    }
}
