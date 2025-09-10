/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.oop.inhertiance;


public class Earth extends Moon{
    
    boolean hasAsteroid;
    
    // Overriding Constructor
    public Earth(boolean hasLight, boolean hasAtmosphere, boolean hasAsteroid) {
        super(hasLight, hasAtmosphere);
        this.hasAsteroid = hasAsteroid;
    }
    
    
    
    public static void main(String[] args) {
        
    }
    
    
}
