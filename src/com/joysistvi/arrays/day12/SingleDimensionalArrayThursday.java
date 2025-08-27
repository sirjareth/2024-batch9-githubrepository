/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.arrays.day12;

public class SingleDimensionalArrayThursday {

    public static void main(String[] args) {
        // syntax on how to decare a single dimensional array

        // datatype[] variable = {value1, value2, .....};
        //            0   1   2    3   4   
        int[] ages = {24, 18, 18, 12, 20, 21};

        // Traverse an array using for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // Traverse an array using for-each loop / enhanced for loop
        for (int age : ages) {
            System.out.println(age);
        }

        String[] color = {"Yellow", "Red", "Blue"};

        float[] temp = {37.8f, 36.5f, 36.0f};

        
    }
}
