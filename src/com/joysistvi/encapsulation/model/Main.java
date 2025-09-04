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
        Student student = new Student();
        System.out.println("* Student Registration System *");
        // ID
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        student.setId(id);
        
        // Name
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        student.setName(name);
        
        
        
        
        id = student.getId();
        System.out.println("ID: " + id);
        name = student.getName();
        System.out.println("Name: " + name);
    }
}
