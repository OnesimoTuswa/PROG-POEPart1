/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Login {
    
    String username;
        
    public void checkUserName(){
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        username = scan.nextLine();
        
        boolean usernamecheck = username.contains("_");
        
        if(usernamecheck == true && username.length() <= 5)
           System.out.println("Username successfully captured");
        else
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }
    
        String password;;
        boolean passwordcomplexity;
        
    public void checkPasswordComplexity(){
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        password = scan.nextLine();
        
        boolean anumber = password.contains("0"), anumber1 = password.contains("1"), anumber2 = password.contains("2"), anumber3 = password.contains("3"), anumber4 = password.contains("4"), anumber5 = password.contains("5"), anumber6 = password.contains("6"), anumber7 = password.contains("7"), anumber8 = password.contains("8"), anumber9 = password.contains("9");
        boolean allnumber = anumber || anumber1 || anumber2 || anumber3 || anumber4 || anumber5 || anumber6 || anumber7 || anumber8 || anumber9;

        boolean sc1 = password.contains("~"), sc2 = password.contains("`"), sc3 = password.contains("!"), sc4 = password.contains("@"), sc5 = password.contains("#"), sc6 = password.contains("$"), sc7 = password.contains("%") ,sc8 = password.contains("^"), sc9 = password.contains("&"), sc10 = password.contains("*"), sc11 = password.contains("("), sc12 = password.contains(")"), sc13 = password.contains("_"), sc14 = password.contains("-"), sc15 = password.contains("+"), sc16 = password.contains("="), sc17 = password.contains("{"), sc18 = password.contains("}"), sc19 = password.contains("["), sc20 = password.contains("]"), sc21 = password.contains("|"), sc22 = password.contains("/"), sc23 = password.contains(":"), sc24 = password.contains(";"), sc25 = password.contains("'"), sc26 = password.contains("<"), sc27 = password.contains(">"), sc28 = password.contains(","), sc29 = password.contains("."), sc30 = password.contains("?");
        boolean specialcharacter = sc1 || sc2 || sc3 || sc4 || sc5 || sc6 || sc7 || sc8 || sc9 || sc10 || sc11 || sc12 || sc13 || sc14 || sc15 || sc16 || sc17 || sc18 || sc19 || sc20 || sc21 || sc22 || sc23 || sc24 || sc25 || sc26 || sc27 || sc28 || sc29 || sc30;

        boolean aa = password.contains("A"), bb = password.contains("B"), cc = password.contains("C"), dd = password.contains("D"), ee = password.contains("E"), ff = password.contains("F"), gg = password.contains("G"), hh = password.contains("H"), ii = password.contains("I"), jj = password.contains("J"), kk = password.contains("K"), ll = password.contains("L"), mm = password.contains("M"), nn = password.contains("N"), oo = password.contains("O"), pp = password.contains("P"), qq = password.contains("Q"), rr = password.contains("R"), ss = password.contains("S"), tt = password.contains("T"), uu = password.contains("U"), vv = password.contains("V"), ww = password.contains("W"), xx = password.contains("X"), yy = password.contains("Y"), zz = password.contains("Z");
        boolean capitalletter = aa || bb || cc || dd || ee || ff || gg || hh || ii || jj || kk || ll || mm || nn || oo || pp || qq || rr || ss || tt || uu || vv || ww || xx || yy || zz;
        
        if(password.length() >= 8 && allnumber == true && specialcharacter == true && capitalletter == true){
            passwordcomplexity = true;
                System.out.println("Password successfully captured");
        }
        else{
            passwordcomplexity = false;
            System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character.");        
        }
    }    
    
    public void registerUser(){
        
        String registeruser = "The two above conditions have been met and the user has been registered successfully.";
        boolean usernamevalid = false;
        boolean passwordvalid = false;
                
        if(username.contains("_") && username.length() <= 5){
            usernamevalid = true;
        }
        else{
            System.out.println("The username is incorrectly formatted");
        }

        if(passwordcomplexity == true){
            passwordvalid = true;
        }
        else{
            System.out.println("The password does not meet the complexity requirements");
        }
        
        if(usernamevalid == true && passwordvalid == true){
            System.out.println(registeruser);
        }
            
    }
    
    boolean loginuser;
            
    public void loginUser(){
        
        String usernamelogin;
        String passwordlogin;
        
        
        Scanner scanuser = new Scanner(System.in);
        System.out.println("Enter username");
        usernamelogin = scanuser.nextLine();
        
        Scanner scanpass = new Scanner(System.in);
        System.out.println("Enter password");
        passwordlogin = scanpass.nextLine();
        
        if(usernamelogin.equals(username) && passwordlogin.equals(password))
            loginuser = true;
        
    }

    public void returnLoginStatus(){
        
        String loginstatus;
        
        if(loginuser == true){
            loginstatus = "A successful login";
                System.out.print(loginstatus);
        }
        else{
            loginstatus = "A failed login";
                System.out.println(loginstatus);
        }
    }
}
    