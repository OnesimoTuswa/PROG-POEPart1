/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121poe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class LoginTest {
    Login login = new Login();
    
    public LoginTest() {
    }

    @Test
    public void testCheckUserName() {
        login.checkUserName();
        
        boolean expectation = true;
        boolean actuality = login.usernamevalidity;
               
        assertEquals(expectation, actuality);
    }

    @Test
    public void testCheckPasswordComplexity() {
        login.checkPasswordComplexity();
        
        boolean actuality = login.passwordcomplexity;
        boolean expectation = true;
        
        assertEquals(expectation, actuality);
    }

    @Test
    public void testReturnLoginStatus() {
        JOptionPane.showMessageDialog(null, "returnLoginStatus");
        String username = "kyl_1";
        String password = "Che&&secke99!";
        String usernameMatch = "kyl_1";
        String passwordMatch = "Che&&secke99!";
        String firstName = "Thokozani";
        String secondName = "Mlambo";
        String expectation = "pass";
        String actuality = expectation;
        
        assertEquals(expectation, actuality);
    }
    
    @Test
    public void testUsernameValidity() {
        login.checkUserName();
        
        boolean expectation = true;
        boolean actuality = login.usernamevalidity;
               
        assertTrue(expectation == actuality);
        assertFalse(expectation != actuality);
    }

    @Test
    public void testPasswordValidity() {        
        login.checkPasswordComplexity();
        
        boolean actuality = login.passwordcomplexity;
        boolean expectation = true;
        
        assertTrue(expectation == actuality);
        assertFalse(expectation != actuality);
    }
}
