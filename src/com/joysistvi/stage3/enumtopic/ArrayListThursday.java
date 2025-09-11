/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage3.enumtopic;

import java.util.ArrayList;

public class ArrayListThursday {

    public static void main(String[] args) {
        ArrayList<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

        ArrayList<Integer> firstTenEvenNumbers = new ArrayList<>(firstFiveEvenNumbers);
        
        firstTenEvenNumbers.add(12);
        firstTenEvenNumbers.add(14);
        firstTenEvenNumbers.add(16);
        firstTenEvenNumbers.add(18);
        firstTenEvenNumbers.add(20); // 9
        
        
        System.out.println(firstTenEvenNumbers.size());
    }

}

/*
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Isuzu");
        cars.add("Honda");
        cars.add("Subawu");
        cars.add("Mcqueen");
        cars.add(1, "Rolls Royce");
        
        ArrayList<String> colors = new ArrayList<>();
        
        
        

    }
*/
