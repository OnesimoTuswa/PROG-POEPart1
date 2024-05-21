/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121poe;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class PROG5121POE {

    public static void main(String[] args) {
        String option;
        int options;
        
        option = JOptionPane.showInputDialog("Enter option. " + "Option 1 is for registering. " + "Option 2 is for logging in.");
        options = Integer.parseInt(option);
        
        switch(options){
            case 1 -> {
                Registration registration = new Registration();
                registration.main();
                registration.login();
            }
            
            case 2 -> {
                Login login = new Login();
                login.checkUserName();
                login.checkPasswordComplexity();
                login.registerUser();
                login.loginUser();
                login.returnLoginStatus();
            }
            
            default -> JOptionPane.showMessageDialog(null, "Invalid");
        }
        
        Tasks tasks = new Tasks();
        tasks.addTasks();
        tasks.checkTaskDescription();
        tasks.createTaskID();
        tasks.printTaskDetails();
        tasks.returnTotalHours();
    }
}
