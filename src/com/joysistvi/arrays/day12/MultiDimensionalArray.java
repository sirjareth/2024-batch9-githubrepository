/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.arrays.day12;


public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        
        // syntax
        int[][] numbers = { {2,4,6,8,10}, {1,3,5,7,9}, {1,2,3,6} };
       
        
        
        String[][] planets = { 
          //   0        1           2       3  
            {"Mercury", "Venus", "Earth", "Mars"},     // 0
            {"Jupiter", "Saturn", "Uranus", "Neptune"}, // 1
            {"Pluto", "Namek"}
        };
        
        
        // Traversing a multidimensional array using nested for-each loop 
        for(String[] rows : planets){
            for(String column : rows){
                System.out.println(column);
            }
            System.out.println("");   
        }
        
        
        
        
        
        
        // Traversing a multidimensional array using nested for loop 
        //              1 < 3
//        for (int i = 0; i < planets.length; i++) { // outer loop (i) -> rows
//            //              0 < 4   
//            for (int j = 0; j < planets[i].length; j++) { // inner loop (j) -> columns
//                //                         1  0
//                System.out.println(planets[i][j]);
//            }
//            System.out.println("");
//        }
        
        
        
    }
}
