/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.hrdept;
/*
    1. Through ClassName (specific class)
    2. Through * (all)
    3. Through fully qualified name (specific class)
*/
import java.util.Scanner;

class A {
    
    
    
    
     static String name; // variable 
    
     static void printName(){ // method
        System.out.println(name);
    }
    
    
    public static void main(String[] args) {
        System.out.println(name);
        printName();
    }
    
    
    public static void sum(){
        name = "Winter";
        printName();
    }
    
    
}


// class / method / variable