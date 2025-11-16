package main;

import java.util.*;
import java.util.Scanner;

import Questioncreation.QuestionCreation;
import User.LoginSignin;
import guessgame.GuessGame;
import questions.Questions;
import timer.Quiz;
import timer.Quiz;

public class Main {
    public static void main(String[] args) {
        LoginSignin ls = new LoginSignin();
        GuessGame guessGame = new GuessGame();
        Scanner sc = new Scanner(System.in);
        ArrayList<Questions> list = new ArrayList<>();
        boolean isLoggedIn = false;  
        boolean run = true;
        byte option;
        while (run) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Play Guess Game");
            System.out.println("4. Create Quiz Questions");
            System.out.println("5. Play Quiz");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            option = sc.nextByte();
      //      sc.nextLine(); 

            switch (option) {
                case 1:
                    isLoggedIn = ls.login();  // user logged in
                    break;

                case 2:
                    ls.signup();
                    isLoggedIn =true;
                    break;

                case 3:
                    if (!isLoggedIn) {
                        System.out.println("Please login first!");
                        break;
                    }
                    guessGame.start();
                    break;

                case 4:
                    if (!isLoggedIn) {
                        System.out.println("Please login first!");
                        break;
                    }
                    list = QuestionCreation.createQuestions();
                    break;

                case 5:
                    if (!isLoggedIn) {
                        System.out.println("Please login first!");
                        break;
                    }
                    if (list.isEmpty()) {
                        System.out.println("No questions created. Create questions first!");
                        break;
                    }
                    Quiz.startQuiz(list);
                    break;

                case 6:
                    run = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
      }
}
