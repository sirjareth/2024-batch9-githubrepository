/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String regUsername = "winter"; // String literal
        String regPassword = "winter123"; //String literal

        
        
        boolean isLoginCorrect = false;
        while (!isLoginCorrect) {
            System.out.print("Username: ");
            String username = scanner.nextLine(); // String by new keyword
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (regUsername.equals(username) && regPassword.equals(password)) {
                System.out.println("Logged In Successfully!");
                isLoginCorrect = true;
            } else {
                System.out.println("Invalid Username / Password");
            }
        }

    }
}

/*
    String regUsername = "winter"; // String literal
    String username = "winter"; // String by new keyword


    == vs. .equals()
*/

/*
    while -> check muna bago gawin
    do while -> gawin muna at least once bago i check

Do Wle Loop
    Login prompt 
    Menu-driven program
    Repeat until valid input
*/