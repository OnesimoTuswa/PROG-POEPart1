/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121poe;

/**
 *
 * @author HP
 */
public class PROG5121POE {

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.main();
        registration.login();
        
        Login login = new Login();
        login.checkUserName();
        login.checkPasswordComplexity();
        login.registerUser();
        login.loginUser();
        login.returnLoginStatus();
        
    }
}
