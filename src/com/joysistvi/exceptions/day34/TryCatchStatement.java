/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.exceptions.day34;

import com.joysis.load_reg.day20.AgeException;

/**
 *
 * @author Yuno
 */
public class TryCatchStatement {

    public static void checkAge(int age) throws AgeException{
        // ducking exception
        if (age < 18) {
            throw new AgeException("You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
        
    }
    
    
    
    public static void main(String[] args){
        try {
            
        } catch (Exception e) {
            
        } 
       
        
    }
    
    
}


/*
    // syntax try catch statement
        // ArrayIndexOutOfBoundsException
        // ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3, 4, 5};
        String number = "10";
        int newNumber = Integer.valueOf(number);

        try {
            int result = newNumber / 0;

        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Hello Mr MJ na pogi");
*/