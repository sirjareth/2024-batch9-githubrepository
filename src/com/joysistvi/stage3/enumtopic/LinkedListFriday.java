/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage3.enumtopic;

import java.util.LinkedList;

/**
 *
 * @author Yuno
 */
public class LinkedListFriday {
    
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        
        students.add(new Student(1, "Winter B. Summer", "Manila", 29, "BSCPE", "Molave"));
        students.add(new Student(2, "Fall C. Spring", "Manila", 30, "BSIT", "Molave"));
        
        //System.out.println(stud.getName());    
        
        //students.forEach(System.out::println);
    }
}


/*
    LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        
        // added methods of LinkedList Collection
        colors.addFirst("White");
        colors.addLast("Yellow");
        colors.removeFirst();
        colors.removeLast();
        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());   
*/