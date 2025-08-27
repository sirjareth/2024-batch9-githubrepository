/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.math.day16;

import java.util.Random;

public class MathClassWed {

    static String name;

    public static void main(String[] args) {
        
        Random random = new Random();
        System.out.println(random);   
        
        /*
            BINGO Simulator
        B: 1 - 15
        I: 16 - 30
        N: 31 - 45
        G: 46 - 60
        O: 61 - 75
        */
        // array, nested loop, if statement
        int roll = (int) (Math.random() * 75) + 1;
        String letter;
        
        if (roll < 16) {
            letter = "B";
        } else if(roll < 31){
            letter = "I";
        } else if(roll < 46){
            letter = "N";
        } else if(roll < 61){
            letter = "G";
        } else {
            letter = "O";
        }
        
        //System.out.println("Sa letra ng " + letter + " : " + roll);
    }
}

/*
    System.out.println("Loto Generator:");
        int randomNumber = 0;
        for (int i = 0; i < 6; i++) {
            randomNumber = (int) (Math.random() * 58) + 1;
            System.out.println(i + 1 + " : " + randomNumber);
        }
*/