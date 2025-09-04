/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.encapsulation.model;

// Model
public class Student {
    
    // data members / private fields
    private int id;
    private String name;
    private String address;
    private int age;
    private String course;
    
    // mutator method / setter
    public void setId(int id){
       this.id = id;
    }
    
    // accessor method / getter
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}


/* Fully Encapsulated Class
    1. making all the data members of the class private - data hiding
    2. use setter and getter methods to set and get the data in it - data validation
    */


// conventional 
    // unconvential 
    // this kw -> immediately refer to the current object