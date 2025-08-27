
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuno
 */
public class NewClass {

    static String[] choices;
    static Scanner scanner = new Scanner(System.in);
    static int selectedNumber;
    static int categoryNumber;
    static int promoNumber;
    static String promo;
    static boolean isTerminated = false;

    public static void exit() {
        System.out.println("\nThank you for using our service. Goodbye!\n");
        isTerminated = true;
    }

    public static void prompt1(String header, String[] choices) {
        System.out.println("\n===========================");
        System.out.println(header);
        System.out.println("===========================\n");

        for (int i = 0; i < choices.length; i++) {
            System.out.println("[" + (i + 1) + "]" + choices[i]);
        }

        System.out.print("Select a category: ");
        selectedNumber = scanner.nextInt();
        categoryNumber = selectedNumber;

        String[] details = new String[4];
        switch (selectedNumber) {
            case 1:
                details = new String[]{"GO50", "GO90", "     Data Only Promos"};
                break;
            case 2:
                details = new String[]{"UNLICALL20", "UNLICALL30", "     Call Only Promos"};
                break;
            case 3:
                details = new String[]{"UNLITXT20", "TXTP20", "     Text Only Promos"};
                break;
            case 4:
                details = new String[]{"UCT30", "UCT50", "    Call & Text Promos"};
                break;
            case 5:
                details = new String[]{"GO+99", "SURF4ALL99", " Data, Call & Text Promos"};
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("\nInvalid Input\n");
                choices = new String[]{
                    "Data Only Promos",
                    "Call Only Promos",
                    "Text Only Promos",
                    "Call & Text Promos",
                    "Data, Call & Text Promos",
                    "Exit\n"};
                prompt1("     Load Registration", choices);
        }
        if (selectedNumber > 0 && selectedNumber < 6) {
            choices = new String[]{
                details[0],
                details[1],
                "Back",
                "Exit\n"};
            prompt2(details[2], choices);
        }

    }

    public static void prompt2(String header, String[] choices) {
        System.out.println("\n===========================");
        System.out.println(header);
        System.out.println("===========================\n");

        for (int i = 0; i < choices.length; i++) {
            System.out.println("[" + (i + 1) + "]" + choices[i]);
        }

        System.out.print("Select a promo: ");
        selectedNumber = scanner.nextInt();
        promoNumber = selectedNumber;

        switch (selectedNumber) {
            case 1:
                choices = new String[]{
                    "Subscribe",
                    "Back",
                    "Exit\n"};
                switch (categoryNumber) {
                    case 1:
                        prompt3("           GO50", choices, "5GB Data", "3");
                        break;
                    case 2:
                        prompt3("           UNLICALL20", choices, "Unlimited calls to Globe/TM", "1");
                        break;
                    case 3:
                        prompt3("           UNLITXT20", choices, "Unlimited texts to Globe/TM", "1");
                        break;
                    case 4:
                        prompt3("           UCT30", choices, "Unlimited calls and texts to Globe/TM", "2");
                        break;
                    case 5:
                        prompt3("           GO+99", choices, "8GB Data, Unlimited calls & texts to Globe/TM", "7");
                        break;
                }
                break;
            case 2:
                choices = new String[]{
                    "Subscribe",
                    "Back",
                    "Exit\n"};
                switch (categoryNumber) {
                    case 1:
                        prompt3("           GO90", choices, "8GB Data", "7");
                        break;
                    case 2:
                        prompt3("           UNLICALL30", choices, "Unlimited calls to Globe/TM", "2");
                        break;
                    case 3:
                        prompt3("           TXTP20", choices, "100 texts to Globe/TM", "2");
                        break;
                    case 4:
                        prompt3("           UCT50", choices, "Unlimited calls to Globe/TM, Unlimited texts to all networks", "3");
                        break;
                    case 5:
                        prompt3("           SURF4ALL99", choices, "9GB shareable data (valid for up to 4 users), Unlimited calls & texts to all networks", "7");
                        break;
                }
                break;
            case 3:
                choices = new String[]{
                    "Data Only Promos",
                    "Call Only Promos",
                    "Text Only Promos",
                    "Call & Text Promos",
                    "Data, Call & Text Promos",
                    "Exit\n"};
                prompt1("     Load Registration", choices);
                break;
            case 4:
                exit();
                break;
        }

    }

    public static void prompt3(String header, String[] choices, String inclusion, String validity) {
        System.out.println("\n===========================");
        System.out.println(header);
        System.out.println("===========================\n");

        System.out.println("- " + inclusion);
        System.out.println("- Valid for " + validity + " days\n");

        for (int i = 0; i < choices.length; i++) {
            System.out.println("[" + (i + 1) + "]" + choices[i]);
        }

        System.out.print("What would you like to do? ");
        selectedNumber = scanner.nextInt();

        switch (selectedNumber) {
            case 1:
                switch (categoryNumber) {
                    case 1:
                        promo = (promoNumber == 1) ? "GO50" : "GO90";
                        break;
                    case 2:
                        promo = (promoNumber == 1) ? "UNLICALL20" : "UNLICALL30";
                        break;
                    case 3:
                        promo = (promoNumber == 1) ? "UNLITXT20" : "TXTP20";
                        break;
                    case 4:
                        promo = (promoNumber == 1) ? "UCT30" : "UCT50";
                        break;
                    case 5:
                        promo = (promoNumber == 1) ? "GO+99" : "SURF4ALL99";
                        break;
                }
                System.out.println("\nYou have successfully subscribed to " + promo + "!\n");
                isTerminated = true;
                break;

            case 2:
                String[] details = new String[4];
                switch (categoryNumber) {
                    case 1:
                        details = new String[]{"GO50", "GO90", "     Data Only Promos"};
                        break;
                    case 2:
                        details = new String[]{"UNLICALL20", "UNLICALL30", "     Call Only Promos"};
                        break;
                    case 3:
                        details = new String[]{"UNLITXT20", "TXTP20", "     Text Only Promos"};
                        break;
                    case 4:
                        details = new String[]{"UCT30", "UCT50", "    Call & Text Promos"};
                        break;
                    case 5:
                        details = new String[]{"GO+99", "SURF4ALL99", " Data, Call & Text Promos"};
                        break;
                }
                choices = new String[]{
                    details[0],
                    details[1],
                    "Back",
                    "Exit\n"};
                prompt2(details[2], choices);
                break;
            case 3:
                exit();
                break;
        }

    }

    public static void main(String[] args) {

        while (!isTerminated) {
            choices = new String[]{
                "Data Only Promos",
                "Call Only Promos",
                "Text Only Promos",
                "Call & Text Promos",
                "Data, Call & Text Promos",
                "Exit\n"};
            prompt1("     Load Registration", choices);
        }
    }
}
