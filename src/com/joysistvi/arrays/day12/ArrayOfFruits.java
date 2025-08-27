/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.arrays.day12;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class ArrayOfFruits {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of fruits: ");
        int noOfFruits = scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[noOfFruits];
        
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter fruit[" + i + "]: ");
            fruits[i] = scanner.nextLine();
        }
        
        System.out.println("\n* Printing all the fruits *");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        /*
            fruits[0]
            fruits[1]
            fruits[2]
            fruits[3]
            fruits[4]
         */
    }
}
