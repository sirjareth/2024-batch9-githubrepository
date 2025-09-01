/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.methods.day20;

// 

public class Person {

    static String firstName;
    String lastName; // instance variable
    
    
    public static void a(){ // static method
        firstName = "Winter";
        
    }
    
    public void d(){
        b();
    }
    
    public void b(){ // instance method
        System.out.println(this.lastName);
        d();
    }
    
    
    public static void c(){
        
    }
    
    public static void main(String[] args) {
        
    }
}

/*
            Instance Method
            Static Method
        
            Instance Variable -> belongs to the object
            Static Variable -> belongs to the class (static kw : non-access modifier)
            Local Variable -> belongs to the method



            static String middleInitial = "F"; // static variable
    String lastname = "Summer"; // instance variable
    
    public static void main(String[] args) {
        String firstName = "Winter"; // local variable 
        System.out.println(middleInitial);
        // Class Instantiation
        Person obj = new Person();
        System.out.println(obj.lastname);
    }
    
    
    public static void print(){
        System.out.println(middleInitial);
    }
        */