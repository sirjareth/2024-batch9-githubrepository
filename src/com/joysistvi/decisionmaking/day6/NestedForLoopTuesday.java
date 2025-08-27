/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;


public class NestedForLoopTuesday {
    
    public static void main(String[] args) {
        //              2 < 5
        for (int i = 1; i <= 5; i++) { // outer loop
            //              1 <= 2
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print("* ");
            }
            System.out.println(""); // new line
        }
        
    }
}

/*
    Grading System
    Student1
    i -> subjects
    j -> grades
*/



/*
    For Each Loop -> Enhance For Loop
    Nested For Loop
*/