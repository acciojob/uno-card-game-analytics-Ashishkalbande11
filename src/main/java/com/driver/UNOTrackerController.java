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
        System.out.println("Enter your choice :");
        System.out.println("1. Store UNO game score :");
        System.out.println("2. Calculate Average Acore :");
        System.out.println("3. Identify top Player");
        System.out.println("4. Exit");
    }

    private void storeScore(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter Player Name");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter Score");
        int score = scanner.nextInt();

        ScoreDTO scoreDTO = new ScoreDTO(name, score);
        unoTrackerService.storeScoreData(scoreDTO);
        System.out.println("Score data stored successfully.");
    }

    private void calculateAverageScore(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter Player Name !");
        scanner.nextLine();
        String name = scanner.nextLine();

        double average = unoTrackerService.calculateAverageScore(name);
        System.out.println("Average score for " + name + ": " + average);
    }

    private void identifyTopPlayer() {
    	//your code goes here

        System.out.println("Top Player " + unoTrackerService.identifyTopPlayer());
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
