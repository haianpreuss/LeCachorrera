/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.senai.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Mendelski
 */
public class ValidadorCnpjTest {
    
    public ValidadorCnpjTest() {
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
    public void testNotIsCNPJ_I() {
        //False
        String CNPJ = " ";
        boolean expResult = false;
        boolean result = ValidadorCnpj.isCNPJ(CNPJ);
        System.out.println("CNPJ " + CNPJ + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNotIsCNPJ_II() {
        //False
        String CNPJ = "1111";
        boolean expResult = false;
        boolean result = ValidadorCnpj.isCNPJ(CNPJ);
        System.out.println("CNPJ " + CNPJ + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNotIsCNPJ_III() {
        //False
        String CNPJ = "casdasd";
        boolean expResult = false;
        boolean result = ValidadorCnpj.isCNPJ(CNPJ);
        System.out.println("CNPJ " + CNPJ + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsCNPJ() {
        //Success
        String CNPJ = "03773700001189";
        boolean expResult = true;
        boolean result = ValidadorCnpj.isCNPJ(CNPJ);
        System.out.println("CNPJ " + CNPJ + ": " + result);
        assertEquals(expResult, result);
    }
    
}
