/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.encapsulation.model;

// Model
// Single Responsibily Principle 
public class Student {

    // data members / private fields
    private int id;
    private String name;
    private String address;
    private int age;
    private String course;
    private String section;
    private String schoolName;

    // method overloading - over loading constructor
    //default constructor
    public Student() {
        
    }
    
    // setter constructor
    public Student(int id, String name, String address, int age, String course, String section) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.course = course;
        this.section = section;
        schoolName = "STI Orca";
        System.out.println("Student " + name + " is created successfully!");
    }

    public Student(int id, String name, String address, int age, String course) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.course = course;
        schoolName = "STI Orca";
        System.out.println("Student " + name + " is created successfully!");
    }

    public Student(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        schoolName = "STI Orca";
        System.out.println("Student " + name + " is created successfully!");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    

    // setter method
    public void setId(int id) {
        this.id = id;
    }
    
    

    // alt + insert
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
    // alt + insert

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", course=" + course + ", section=" + section + ", schoolName=" + schoolName + '}';
    }
    

}


/* Fully Encapsulated Class
    1. making all the data members of the class private - data hiding
    2. use setter and getter methods to set and get the data in it - data validation
 */
// conventional 
// unconvential 
    // this kw -> immediately refer to the current object
