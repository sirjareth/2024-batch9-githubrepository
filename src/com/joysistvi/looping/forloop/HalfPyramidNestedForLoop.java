/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.looping.forloop;


public class HalfPyramidNestedForLoop {
    
    public static void main(String[] args) {
        //              2 <= 5
        for (int i = 1; i <= 5; i++) {
            //              3 <= 2
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // new line
        }
        
    }
    
}
