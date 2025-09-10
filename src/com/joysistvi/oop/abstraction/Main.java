/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.oop.abstraction;

/**
 *
 * @author Yuno
 */
public class Main {
    
    public static void main(String[] args) {
        Van van = new Van();
        van.displayColor();
    }
}

// Repository
class A extends B implements D, E{}
class B{}
class C implements E, D{}

interface D extends E{}
interface E {}
interface F extends D, E{}


