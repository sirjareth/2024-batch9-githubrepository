/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage3.enumtopic;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Yuno
 */
public class HashSetFriday {
    
    public static void main(String[] args) {
        HashSet<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();
        
        while(lottoNumbers.size() < 6){
            
            int randomNumber = random.nextInt(58) + 1;
            lottoNumbers.add(randomNumber);
        }
        
        System.out.println("Generated Lotto Numbers: ");   
        lottoNumbers.forEach(System.out::println);
    }
}
