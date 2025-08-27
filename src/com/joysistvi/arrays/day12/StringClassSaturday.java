/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.arrays.day12;

import java.util.Scanner;

public class StringClassSaturday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = "Female"; // String literal
        System.out.println(gender);

        System.out.println("Do you want to delete your account?");
        System.out.println("    [Y] Yes \t [N] No");
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("y")) {
            System.out.println(choice + " : Deleted succesfully!" );

        } else {
            System.out.println("");
        }
    }
}
