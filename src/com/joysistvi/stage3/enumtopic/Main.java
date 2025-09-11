/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage3.enumtopic;

import java.util.Scanner;


public class Main {
    
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        String day = scanner.nextLine().trim().toUpperCase();
        Days enumDay = Days.valueOf(day);
        
        switch(enumDay){
            case SUNDAY:
                System.out.println("First Day of the Week.");
                break;
            case MONDAY:
                System.out.println("Second Day of the Week");
                break;
            default:
                System.out.println("Invalid Day!");
        }
        
    }
    
}



