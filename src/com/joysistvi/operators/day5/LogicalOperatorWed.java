/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.operators.day5;

public class LogicalOperatorWed {

    // Logical &&   Bitwise &
    // Logical ||   Bitwise |
    // Return Value: Boolean(true/false)
    // Compound Conditional Statement
    // age: 1-17 -> Not yet a voter
    public static void main(String[] args) {
        /*
        choices: OOP's
            1. Java 
            2. Python
            3. Ruby
            4. C Lang
        */
        
        int choice = 2;
        boolean isOop = choice == 1 && choice == 2 && choice == 3 && choice == 4;
        
        System.out.println(isOop);
    }
    
    
    
    
    

    /* 1st  2nd Result
        T   T    T
        T   F    F
        F   T    F
        F   F    F
    Logical &&
     */
 /* 1st  2nd Result
        T   T    T
        T   F    T
        F   T    T
        F   F    F
    Logical ||
     */
}


/*
    int age = 18;

        boolean isNotYetAVoter = age >= 1 && age <= 17;
         
        System.out.println(isNotYetAVoter);
 */
