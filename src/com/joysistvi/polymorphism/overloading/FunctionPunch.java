/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.overloading;


public class FunctionPunch {

    // non-parametherized method
    public void punch(){
        
    }
    
    public void punch(int noOfPunch){
        
    }
    
    public void punch(long noOfPunch){
        
    }
    
    public void punch(double noOfPunch){
        
    }
    
    public void punch(int noOfPunch, String animation){
        
    }
    
    public void punch(String animation, int noOfPunch){
        
    }
    
    public void punch(String style, int noOfFire, String animation){
        
    }
    
    public void punch(int noOfFire, String style,  String animation){
        
    }
    
    public void punch(int noOfFire, String style,  char animation){
        
    }
    
    public static void main(String[] args) {
        FunctionPunch p = new FunctionPunch();
        p.punch(50);
        
        
    }
    
    
}
