/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.string.day15;

import java.util.Scanner;




public class StringMethodExample {
    
    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your gender: ");
//        char gender = scanner.nextLine().trim().charAt(0);
//        
//        System.out.println(gender);  
        
        // Parsing -> process of converting a primitive DT to a String or vice versa
        // Casting -> Number Class
        /*
            upcasting
            downcasting
        */
        
        double num = 10.00;
        
        int newNumber = (int) num;
        System.out.println(newNumber);
        
        
        
//        String number = "50";
//        
//        int newNumber = Integer.parseInt(number);
//        System.out.println(newNumber);
//        
        
        
        
        
//        int num = 20;
//        
//        
//        String newNumber = String.valueOf(num);
//        System.out.println(newNumber);
        
        
        
        /*
            a. true
            b. false
            c. exception
            d. compilation fails
            e. null
        */
    }
}

/* indexOf / lastIndexOf
        Scanner scanner = new Scanner(System.in);
        String word = "Hello Jareth Punta Samin";
        System.out.print("Enter string to find: ");
        
        String stringToFind = scanner.nextLine();
        
        System.out.println(word.indexOf(stringToFind, word.indexOf(stringToFind) + 1));
*/

/* charArray()
    String gender = "Female";
        char[] arrGender = gender.toCharArray();
        
        for (int i = arrGender.length -1; i >= 0; i--) {
            System.out.println(arrGender[i]);   
        }
*/