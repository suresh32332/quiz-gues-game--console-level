package guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public void start() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean gameMenu = true;
        int score = 0;  //   total score 
        int rounds = 0;  // how many rounds
        while (gameMenu) {
            System.out.println("\n Welcome to the Guess Game!");
            System.out.println("1. Start Game");
            System.out.println("2. show your score");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                	   rounds++;
                    int secret = random.nextInt(10)+1; // 1 to 10
                    System.out.print("Guess a number (1–10): ");
                    int guess = sc.nextInt();

                    if (guess == secret) {
                        System.out.println(" Correct! You guessed the number!");
                        
                    } else {
                        System.out.println(" Wrong! The correct number was " + secret);
                    }
                    
                    System.out.print("Do you want to play again? (yes/no): ");
                    String again = sc.next().toLowerCase();
                    if (!again.equals("yes")) {
                        System.out.println("Returning to game menu...");
                    }
                    break;
                    
                case 2:
                    System.out.println(" Total rounds played: " + rounds);
                    System.out.println(" Total correct guesses: " + score);
                    System.out.println("Your accuracy: " + 
                        (rounds > 0 ? (score * 100 / rounds) : 0) + "%");
                    break;

                case 3:
                    gameMenu = false; // back to main menu
                    break;

                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
}
