/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.decisionmaking.day6;

import java.util.Scanner;

public class LoadRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dial = scanner.nextLine();

        if (dial.equals("*143#")) {
            int menuChoice;
            do {
                System.out.println("\n\t* Load Registration *");
                System.out.println("    [1] Go+");
                System.out.println("    [2] Go");
                System.out.println("    [3] GoEXTRA");
                System.out.println("    [4] UNLI 5G");
                System.out.println("    [5] ALLNET");
                System.out.println("    [0] EXIT");
                System.out.print("Enter a choice: ");
                menuChoice = scanner.nextInt();

                if (menuChoice == 1) { // Go+
                    int choiceGoPlus;
                    do {
                        System.out.println("\n\n\t*** Go+ Promos ***");
                        System.out.println("    [1] Go+99");
                        System.out.println("    [2] Go+129");
                        System.out.println("    [3] Go+149");
                        System.out.println("    [0] Exit");
                        System.out.print("Enter a choice: ");
                        choiceGoPlus = scanner.nextInt();

                        switch (choiceGoPlus) {
                            case 1:
                                int goPlus99;
                                do {
                                    // Go+99
                                    System.out.println("\n\n\t*** Go+99 Promo ***");
                                    System.out.println("-> Get 8 GB for all sites + 8GB for Tiktok");
                                    System.out.println("    [1] Subscribe");
                                    System.out.println("    [2] Back");
                                    System.out.println("    [0] Exit");
                                    System.out.print("Enter a choice: ");
                                    goPlus99 = scanner.nextInt();
                                    if (goPlus99 == 1) {
                                        System.out.println("\n\nYou are now subscribed to Go+99");
                                    } else if (goPlus99 == 2) {
                                        // back
                                    } else {
                                        System.out.println("* Thank you! *");
                                    }
                                   
                                } while (goPlus99 != 0);
                                break;
                            case 2:
                                // Go+129
                                System.out.println("\n\n\t*** Go+129 Promo ***");
                                System.out.println("Get 10 GB for all sites + 10GB");
                                System.out.println("    [1] Subscribe");
                                System.out.println("    [2] Back");
                                System.out.println("    [3] Exit");
                                System.out.print("Enter a choice: ");
                                choiceGoPlus = scanner.nextInt();
                                if (choiceGoPlus == 1) {
                                    System.out.println("You are now subscribed to Go+129");
                                } else {
                                }
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }

                    } while (choiceGoPlus != 0);

                } else if (menuChoice == 2) { // Go
                    System.out.println("    [1] Go99");
                    System.out.println("    [2] Go129");
                    System.out.println("    [3] Go149");
                    System.out.print("Enter a choice: ");
                    int choiceGoPlus = scanner.nextInt();
                } else if (menuChoice == 3) { // GoEXTRA
                    System.out.println("    [1] GoExtra99");
                    System.out.println("    [2] GoExtra129");
                    System.out.println("    [3] GoExtra149");
                }
            } while (menuChoice != 0);

        } else {
            System.out.println("Invalid USSD Code");
        }

        scanner.close();
    }
}

/*
    dial == "*143#"
    dial.equals(*143#)

    Object dial = *143#
    String dial2 = *143#
 */
