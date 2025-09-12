/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stage3.enumtopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListThursday {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Isuzu");
        cars.add("Honda");
        cars.add("Subawu");
        cars.add("Mcqueen");
        cars.add("Rolls Royce");
        
        Collections.shuffle(cars);
        cars.forEach(System.out::println);
        
//        Collections.sort(cars);
//        cars.forEach(System.out::println);
//        
//        System.out.println("");
//        
//        Collections.reverse(cars);
//        cars.forEach(System.out::println);
        
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


    /*
    ArrayList<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);
        
        if (!firstFiveEvenNumbers.contains(10)) {
            firstFiveEvenNumbers.add(10);
        }
        
        System.out.println(firstFiveEvenNumbers);
        

        ArrayList<Integer> firstTenEvenNumbers = new ArrayList<>(firstFiveEvenNumbers);
        
        firstTenEvenNumbers.add(12);
        firstTenEvenNumbers.add(14);
        firstTenEvenNumbers.add(16);
        firstTenEvenNumbers.add(18);
        firstTenEvenNumbers.add(20); // 9
        
        
        //System.out.println(firstTenEvenNumbers.size());
*/

/*
    ArrayList<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);
        
        // For Loop
//        for (int i = 0; i < firstFiveEvenNumbers.size(); i++) {
//            System.out.println(firstFiveEvenNumbers.get(i));
//        }
        
        // For Each Loop
//        for(int firstFiveEvenNumber : firstFiveEvenNumbers){
//            System.out.println(firstFiveEvenNumber);
//        }
        
        firstFiveEvenNumbers.forEach(System.out::println);
*/