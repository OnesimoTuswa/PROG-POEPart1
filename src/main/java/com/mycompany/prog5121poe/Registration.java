/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class Registration {
    String username, password, firstname, lastname;
    
    boolean allnumber;
    boolean specialcharacter;
    boolean capitalletter;
    boolean passwordcomplexity;
    
    //This method is where the user will input their registration details.
    public void main(){
        
    firstname = JOptionPane.showInputDialog("Enter your first name here");
    
    lastname = JOptionPane.showInputDialog("Enter your last name here");
    
    username = JOptionPane.showInputDialog("Enter your username here");
    
    //These are the conditions that must be met in order for the username to be considered valid.
    boolean underscore = username.contains("_");
    
    if(underscore == true && username.length() <= 5){
        JOptionPane.showMessageDialog(null, "Username succesfully captured");
    }
    else{
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }
    
    password = JOptionPane.showInputDialog("Enter your password");
    //These are the conditions that must be met in order for the username to be considered valid.
    boolean anumber = password.contains("0"), anumber1 = password.contains("1"), anumber2 = password.contains("2"), anumber3 = password.contains("3"), anumber4 = password.contains("4"), anumber5 = password.contains("5"), anumber6 = password.contains("6"), anumber7 = password.contains("7"), anumber8 = password.contains("8"), anumber9 = password.contains("9");
    boolean allnumber = anumber || anumber1 || anumber2 || anumber3 || anumber4 || anumber5 || anumber6 || anumber7 || anumber8 || anumber9;

    boolean sc1 = password.contains("~"), sc2 = password.contains("`"), sc3 = password.contains("!"), sc4 = password.contains("@"), sc5 = password.contains("#"), sc6 = password.contains("$"), sc7 = password.contains("%") ,sc8 = password.contains("^"), sc9 = password.contains("&"), sc10 = password.contains("*"), sc11 = password.contains("("), sc12 = password.contains(")"), sc13 = password.contains("_"), sc14 = password.contains("-"), sc15 = password.contains("+"), sc16 = password.contains("="), sc17 = password.contains("{"), sc18 = password.contains("}"), sc19 = password.contains("["), sc20 = password.contains("]"), sc21 = password.contains("|"), sc22 = password.contains("/"), sc23 = password.contains(":"), sc24 = password.contains(";"), sc25 = password.contains("'"), sc26 = password.contains("<"), sc27 = password.contains(">"), sc28 = password.contains(","), sc29 = password.contains("."), sc30 = password.contains("?");
    boolean specialcharacter = sc1 || sc2 || sc3 || sc4 || sc5 || sc6 || sc7 || sc8 || sc9 || sc10 || sc11 || sc12 || sc13 || sc14 || sc15 || sc16 || sc17 || sc18 || sc19 || sc20 || sc21 || sc22 || sc23 || sc24 || sc25 || sc26 || sc27 || sc28 || sc29 || sc30;

    boolean aa = password.contains("A"), bb = password.contains("B"), cc = password.contains("C"), dd = password.contains("D"), ee = password.contains("E"), ff = password.contains("F"), gg = password.contains("G"), hh = password.contains("H"), ii = password.contains("I"), jj = password.contains("J"), kk = password.contains("K"), ll = password.contains("L"), mm = password.contains("M"), nn = password.contains("N"), oo = password.contains("O"), pp = password.contains("P"), qq = password.contains("Q"), rr = password.contains("R"), ss = password.contains("S"), tt = password.contains("T"), uu = password.contains("U"), vv = password.contains("V"), ww = password.contains("W"), xx = password.contains("X"), yy = password.contains("Y"), zz = password.contains("Z");
    boolean capitalletter = aa || bb || cc || dd || ee || ff || gg || hh || ii || jj || kk || ll || mm || nn || oo || pp || qq || rr || ss || tt || uu || vv || ww || xx || yy || zz;
    
    if(password.length() >= 8 && allnumber == true && specialcharacter == true && capitalletter == true){
        passwordcomplexity = true;
            JOptionPane.showMessageDialog(null, "Password Successfully captured");
    }
    else{
        passwordcomplexity = false;
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character.");
    }
    }    

    public void login(){
    String usernamelog;
    String passwordlog;
    String firstname1 = firstname;
    String lastname1 = lastname;
    String username2 = username;
    String password2 = password;
    
    //The user will Log In by inputting their username and password again in order for it to be checked if it matches with the initial inputs.
    usernamelog = JOptionPane.showInputDialog("Enter your username");
    passwordlog = JOptionPane.showInputDialog("Enter your password");
    
    boolean usernamecheck = usernamelog.equals(username2);
    boolean passwordcheck = passwordlog.equals(password2);
    
    if(usernamecheck == true && passwordcheck == true && username.length() <= 5 && password.length() >= 8)
        JOptionPane.showMessageDialog(null, "Welcome, " + firstname1 + " " + lastname1 + " it is great to see you again.");
    else
        JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
    }    
}