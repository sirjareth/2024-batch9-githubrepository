/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.overloading;


public class PriorityNumeric {
    
    public void punch(long num){System.out.println("long");}
    public void punch(int num){System.out.println("int");}
    
    public void punch(float num){System.out.println("float");}
    public void punch(double num){System.out.println("double");}
    
    public static void main(String[] args) {
        PriorityNumeric obj = new PriorityNumeric();
        obj.punch(0);
    }
    
    
    
}
// smallest to biggest
// int long float double Integer Long Float Double