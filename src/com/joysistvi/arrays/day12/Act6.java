/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.arrays.day12;


public class Act6 {
    
    public static void main(String[] args) {
        int[] grades = {88, 76, 54, 99};
        
        
        //System.out.printf("%-15s %-10s %-10s %-10s %n", "Student", "Filipino", "English", "Average");
        
        for(int grade : grades){
            
            System.out.printf("%-10s %-10s %-10s %n",  "Filipino", "English", "Average");
        }
    }
}
