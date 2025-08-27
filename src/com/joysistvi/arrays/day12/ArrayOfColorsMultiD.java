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
public class ArrayOfColorsMultiD {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int noOfRows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int noOfColumns = scanner.nextInt();
        scanner.nextLine(); // anti-bug
        String[][] colors = new String[noOfRows][noOfColumns];
        
 
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print("Enter color[" + i + "][" + j + "]: ");
                //     1  3
                colors[i][j] = scanner.nextLine();
            }
            System.out.println(""); // new line
        }
        
        System.out.println("\nPrinting all the colors:");
        for(String[] rows : colors){
            for(String column : rows){
                System.out.println(column);
            }
            System.out.println("");
        }
        
    }
}
