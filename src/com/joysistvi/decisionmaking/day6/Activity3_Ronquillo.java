/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;

public class Activity3_Ronquillo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age Categorizer");
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        
        /*
           1-100 
        */
        
        // code progression
        // industry coding standard
        // nested if statement
        
        String category = "";
        
        
        if (age <= 2){ // 1-2
            category = "Baby";
        } else if(age <= 12){ // 3-12  outer if
            category = "Child";
            
            if (age <= 5) { // inner if
                System.out.println("Pasaway");
            } else {
                System.out.println("Hindi pasaway");
            }
            
        } else if(age <= 19){ // 13-19
            category = "Teenager";
        } else if(age <= 29){
            category = "Young Adult";
        } else if(age <= 59){
            category = "Adult";
        } 
        
        String eligibility = "";
        
        if(age <= 100){ // 60 - 100 // outer if
            category = "Senior";

            if(age <= 70){ // inner if
                eligibility = "Not Eligible to pension";   
            } else {
                eligibility = "Eligible to pension";
            }
            
        } else{
            System.out.println("Invalid Input!");
        }
        
        System.out.println("Age: " + age + " - Category: " + category);
        System.out.println(eligibility);
        
        
        scanner.close();
        
        // 60 - 100 Senior
        // 60 - 70 Not Eligible to pension
        // 70 - 100 Eligible to pension
        
    }
    
    
    
}

/*

*/