/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.overloading;


public class Numerical {
    
    public void sum(Integer a, Integer b){
        System.out.println("Integer sum is " + (a + b));}
    
    public void sum(double a, double b){
        System.out.println("double sum is " + (a + b));}
    
    public void sum(Float a, Float b){
        System.out.println("float sum is " + (a + b));}
    
    
    public static void main(String[] args) {
        Numerical numerical = new Numerical();
        numerical.sum(100, 100);
        //numerical.sum(100.0, 100.0);
        
        
        
    }
    
    /*
        a. Integer sum is 200
        b. double sum is 200.0
        c. float sum is 200.0
    */
   
}
