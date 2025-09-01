/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.oopintro.laptop;


public class Main {
    
    public static void main(String[] args) {
        // Class Instantiation
        // ClassName object = new ClassName();
        Laptop laptop = new Laptop();
        laptop.brand = "HP";
        laptop.color = "Gray";
        laptop.processor = "i8";
        laptop.ramInGb = 16;
        laptop.toCreateApplications();
        laptop.toEditVideos();
        
        Laptop laptop2 = new Laptop();
        laptop2.brand = "ACER";
        laptop2.color = "Red";
        laptop2.ramInGb = 8;
        laptop2.processor = "i5";
        laptop2.toCreateApplications();
        laptop2.toWatchVideos();
        
        Laptop laptop3 = new Laptop();
        laptop2.brand = "ROG";
        laptop2.color = "White";
        laptop2.ramInGb = 36;
        laptop2.processor = "i5";
        laptop2.toCreateApplications();
        laptop2.toWatchVideos();
        laptop.toEditVideos();
    }
}
