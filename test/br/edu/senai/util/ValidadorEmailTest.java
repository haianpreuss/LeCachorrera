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
public class ValidadorEmailTest {
    
    public ValidadorEmailTest() {
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
    public void testIsValidEmail() {
        String email = "gatuxinho25@gmail.com";
        boolean expResult = true;
        boolean result = ValidadorEmail.isValidEmailAddressRegex(email);
        System.out.println("Email: " + email + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNotValidEmail_I() {
        String email = "gatuxinho25";
        boolean expResult = false;
        boolean result = ValidadorEmail.isValidEmailAddressRegex(email);
        System.out.println("Email: " + email + ": " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNotValidEmail_II() {
        String email = "gmial.com";
        boolean expResult = false;
        boolean result = ValidadorEmail.isValidEmailAddressRegex(email);
        System.out.println("Email: " + email + ": " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNotValidEmail_III() {
        String email = " ";
        boolean expResult = false;
        boolean result = ValidadorEmail.isValidEmailAddressRegex(email);
        System.out.println("Email: " + email + ": " + result);
        assertEquals(expResult, result);
    }
}
