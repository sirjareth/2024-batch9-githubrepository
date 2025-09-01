/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.methods.day20;

import java.util.Scanner;

public class LoginSystem {
    
    public static void main(String[] args) {
        loginRegForm();
           
    }
    
    // validation
    public static boolean login(String username, String password) { // method header
        String regUsername = "admin";
        String regPassword = "admin"; // local variable
        
        return (regUsername.equals(username) && regPassword.equals(password));
        
    }
    
    
    // view
    public static void loginRegForm() {
        Scanner sc = new Scanner(System.in);
        
        boolean credential = false;
        while (!credential) {
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.println(" ");
            System.out.print("Password: ");
            String password = sc.nextLine();
            System.out.println(" ");

            
            
            // true / false
            if(login(username, password)){
                System.out.println("Logged In Successfully!" );
               
                credential = true;
                // DashBoard
            } else {
                System.out.println("Invalid Username / Password\n");
            }

        }
    }
    
    public static String printName(String name){
        return name;
    }
}
