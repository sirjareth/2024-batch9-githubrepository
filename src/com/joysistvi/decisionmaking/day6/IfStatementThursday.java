/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;


public class IfStatementThursday {
    
    public static void main(String[] args) {
        
        
        
//        String result = (number % 2 == 0) ? "Even" : "Odd";
//        System.out.println(result);
        
        // syntax
        
        // simple if statement
        // if else statement
        
        int number = 101;
        
        String result = "";
        
        if(number % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        } 
        
        System.out.println(result);
        
    }
}
