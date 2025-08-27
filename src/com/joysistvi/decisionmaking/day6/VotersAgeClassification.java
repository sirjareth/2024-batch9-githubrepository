/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;

public class VotersAgeClassification {

    /*  Age         Classification
        18 above    National Election
        15 - 17     SK Election
        14 below    Not yet a voter
     */
    // Scanner
    // psvm + tab
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // class instantiation
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        if (age >= 0 && age <= 100) {
            if (age <= 14) {
                System.out.println("Not yet a voter");
            } else if (age <= 17) {
                System.out.println("SK Election");
            } else if (age <= 100) {
                System.out.println("National Election");
            } else {
                System.out.println("Invalid Input!");
            }
        } else {
            System.out.println("Invalid Age Input. Age must be greater than 0");
        }

        scanner.close();

        // validation
    }

}

/*
    
*/
