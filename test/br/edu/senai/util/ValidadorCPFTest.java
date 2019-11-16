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
 *
 * @author Mendelski
 */
public class ValidadorCPFTest {

    public ValidadorCPFTest() {
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
    public void testIsCPF() {
        String CPF = "45317828791";
        boolean expResult = true;
        boolean result = ValidadorCPF.isCPF(CPF);
        System.out.println("CPF " + CPF + ": " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotIsCPF() {
        String CPF = " ";
        boolean expResult = false;
        boolean result = ValidadorCPF.isCPF(CPF);
        System.out.println("CPF " + CPF + ": " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotIsCPF_II() {
        String CPF = "asdasda";
        boolean expResult = false;
        boolean result = ValidadorCPF.isCPF(CPF);
        System.out.println("CPF " + CPF + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNotIsCPF_III() {
        String CPF = "16368161";
        boolean expResult = false;
        boolean result = ValidadorCPF.isCPF(CPF);
        System.out.println("CPF " + CPF + ": " + result);
        assertEquals(expResult, result);
    }

}
