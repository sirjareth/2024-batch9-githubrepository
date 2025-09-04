/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.load_reg.day20;

import java.util.Scanner;

public class LoadRegistrationSystem {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        mainMenu();
        scanner.close();
    }
    
    public static void mainMenu() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dial = scanner.nextLine();

        if (dial.equals("*143#")) {
            int menuChoice;
            System.out.println("\n\t* Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] EXIT");
            System.out.print("Enter a choice: ");
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    goPlusPromo();
                    break;
                case 2:
                    goPromo();
                    break;
                case 3:
                    goExtraPromo();
                    break;
                case 4:
                    unli5GPromo();
                    break;
                case 5:
                    allNetPromo();
                    break;
                case 0:
                    exitConfirmation();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } else {
            System.out.println("Invalid USSD Code");
        }
    }
    
    

    public static void goPlusPromo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\t*** Go+ Promos ***");
        System.out.println("    [1] Go+99");
        System.out.println("    [2] Go+129");
        System.out.println("    [3] Go+149");
        System.out.println("    [4] Back");
        System.out.println("    [0] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = scanner.nextInt();

        switch (choiceGoPlus) {
            case 1:
                subscribe("Go+99", 10, 8);
                break;
            case 2:
                subscribe("Go+129", 12, 10);
                break;
            case 3:
                subscribe("Go+149", 14, 12);
                break;
            case 4:
                mainMenu();
                break;
            case 0:
                exitConfirmation();
                break;
            default:
                

        }
    }

    public static void subscribe(String promoType, int gb, int freebiesInGb) {
        System.out.println("\n\n\t*** " + promoType + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + 8GB for Tiktok");

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = 0;

        if (choiceGoPlus == 1) {
            System.out.println("You are now subscribed to " + promoType);
        } else if (choiceGoPlus == 2) {
            //back
        } else {
            exitConfirmation();
        }

    }
    
    
    public static void subscribe(String promoType, int gb) {
        System.out.println("\n\n\t*** " + promoType + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + 8GB for Tiktok");

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = 0;

        if (choiceGoPlus == 1) {
            System.out.println("You are now subscribed to " + promoType);
        } else if (choiceGoPlus == 2) {
            //back
        } else {
            exitConfirmation();
        }

    }

    public static void goPromo() {

    }

    public static void goExtraPromo() {

    }

    public static void unli5GPromo() {

    }

    public static void allNetPromo() {

    }

    public static void exitConfirmation() {
        System.out.println("    [Y] Yes");
        System.out.println("    [N} No");
        
        if (true) {
            
        } else {
            
        }
    }

}
