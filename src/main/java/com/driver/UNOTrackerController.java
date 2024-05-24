package com.driver;

import java.util.Scanner;

public class UNOTrackerController {
    private UNOTrackerService unoTrackerService;

    public UNOTrackerController(UNOTrackerService unoTrackerService) {
        this.unoTrackerService = unoTrackerService;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    storeScore(scanner);
                    break;
                case 2:
                    calculateAverageScore(scanner);
                    break;
                case 3:
                    identifyTopPlayer();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void printMenu() {
    	//your code goes here
    }

    private void storeScore(Scanner scanner) {
    	//your code goes here
    }

    private void calculateAverageScore(Scanner scanner) {
    	//your code goes here
    }

    private void identifyTopPlayer() {
    	//your code goes here
    }

    public static void main(String[] args) {
        // Create necessary objects and start the application
        ScoreDataRepository repository = new ScoreDataRepository();
        UNOTrackerService unoTrackerService = new UNOTrackerService(repository);
        UNOTrackerController unoTrackerController = new UNOTrackerController(unoTrackerService);

        // Start processing user input
        unoTrackerController.processUserInput();
    }
}
