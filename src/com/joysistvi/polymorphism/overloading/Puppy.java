/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.overloading;

/**
 *
 * @author Yuno
 */
public class Puppy extends Dog{
    String name = "Summer";
    
    public void displayName(){
        //System.out.println(super.name);
        
       
    }
    
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.displayName();
    }
    
    
}
