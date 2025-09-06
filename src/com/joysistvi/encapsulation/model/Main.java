/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.encapsulation.model;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enrollment Management System
        Student student1 = new Student(1, "Winter", "Manila", 55, "BSIT", "Molave");
        Student student2 = new Student(2, "Summer", "Mindoro", 35, "BSCPE");
        Student student3 = new Student(3, "Spring", "Rizal", 25);
        Student student4 = new Student(4, "Fall");
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        
        
       
        
        
        
        
    }
}
