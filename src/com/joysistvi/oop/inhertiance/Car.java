/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.oop.inhertiance;

// SRP 
// DRY

// Child Class / Sub Class / Derived Class / Extended Class
public class Car extends Vehicle{
    
    public void stop(){
        
    }
    
    public void displaySpecs(){
        Car car = new Car();
        car.brand = "Isuzu Sportivo";
        car.countOfWheels = 4;
        car.color = "Midnight Blue";

        System.out.println("Car Specifications");
        System.out.println(car.brand);
        System.out.println(car.countOfWheels);
        System.out.println(car.color);
    }
    
    
}
