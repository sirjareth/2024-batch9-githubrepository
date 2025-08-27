/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;



public class SwitchStatementSat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n\t* Load Registration *");
        System.out.println("    [1] Go+");
        System.out.println("    [2] Go");
        System.out.println("    [3] GoEXTRA");
        System.out.println("    [4] UNLI 5G");
        System.out.println("    [5] ALLNET");
        System.out.print("Enter a choice: ");
        
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1: 
                System.out.println("\n\n\t*** Go+ Promos ***");
                System.out.println("    [1] Go+99");
                System.out.println("    [2] Go+129");
                System.out.println("    [3] Go+149"); 
                break;
            case 2:
                System.out.println("    [1] Go99");
                System.out.println("    [2] Go129");
                System.out.println("    [3] Go149");
                break;
            case 3:
                System.out.println("    [1] GoExtra99");
                System.out.println("    [2] GoExtra129");
                System.out.println("    [3] GoExtra149");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
                
                
        }
        
        // Pwede: byte short int long String
        // Bawal: boolean float double
    }
}

