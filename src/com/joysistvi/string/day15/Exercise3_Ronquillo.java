/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.string.day15;

/**
 *
 * @author Yuno
 */
public class Exercise3_Ronquillo {

    public static void main(String[] args) {
        String country = "Philippines";
        String vowels = "aeiou";
        //System.out.println(country.charAt(0));
        //System.out.println(country.charAt(country.length() -1));

        int count = 0;
        for (int i = 0; i < country.length(); i++) {
            String letter = String.valueOf(country.charAt(i));
            if (letter.toUpperCase().contains("P")) {
                count++;
            }
        }
        
        
        System.out.println(count);
//        int counter = 0;
//        //              0
//        for (int i = 0; i < country.length(); i++) {
//            //              1 < 5
//            for (int j = 0; j < vowels.length(); j++) {
//                    //             P  == e
//                if (country.charAt(i) == vowels.charAt(j)) {
//                    counter++;
//                }
//            }
//        }
//        System.out.println("There are " + counter + " vowels.");
    }
}

/*
    for (int i = 0; i < country.length(); i++) {
            if (country.toLowerCase().charAt(i) == 'a'
                    || country.toLowerCase().charAt(i) == 'e'
                    || country.toLowerCase().charAt(i) == 'i'
                    || country.toLowerCase().charAt(i) == 'o'
                    || country.toLowerCase().charAt(i) == 'u') {
                count++;
            }
            
        }
*/