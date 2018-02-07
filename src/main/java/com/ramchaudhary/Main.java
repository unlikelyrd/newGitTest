package com.ramchaudhary;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StateList statelist = new StateList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    statelist.printStateList();
                    break;
                case 2:
                    addState();
                    break;
                case 3:
                    modifyState();
                    break;
                case 4:
                    searchForState();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of states.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To search for an item in the list.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addState(){
        System.out.println("PLease enter the state: ");
        statelist.addStateItem(scanner.nextLine());
    }

    public static void modifyState() {
        System.out.println(" Enter state population");
        int stateName = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement state: ");
        String newState = scanner.nextLine();
        statelist.modifyStateItem(stateName-1, newState);
    }

    public static void searchForState(){
        System.out.println("State to search for: ");
        String searchItem = scanner.nextLine();
        if(statelist.findItem(searchItem) !=null) {
            System.out.println("Found "+ searchItem + " in your list");
        }else {
            System.out.println(searchItem + " is not in the state list.");
        }
    }
}