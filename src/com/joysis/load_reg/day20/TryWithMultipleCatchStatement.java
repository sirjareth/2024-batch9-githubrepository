
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.load_reg.day20;

import java.sql.SQLException;



public class TryWithMultipleCatchStatement {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        
        String query = "SELECT * FROM tblbook";
        
        // Java Database Connectivity -> Exceptions Handling
        
        try {
           int result = j / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your are going out of bounds: " + e);
        } catch (ArithmeticException e){
            System.out.println("Divided by zero: " + e);
        } 
        
        
        
        
        
    }
}
