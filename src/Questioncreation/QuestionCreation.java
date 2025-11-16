package Questioncreation;

import java.util.*;

import questions.Questions;

public class QuestionCreation {

    public static ArrayList<Questions> createQuestions() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Questions> list = new ArrayList<>();

        System.out.print("How many questions you want to create? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.println("\n--- Question " + i + " ---");

            System.out.print("Enter question: ");
            String q = sc.nextLine();

            String[] options = new String[4];

            System.out.print("Option A: ");
            options[0] = sc.nextLine();

            System.out.print("Option B: ");
            options[1] = sc.nextLine();

            System.out.print("Option C: ");
            options[2] = sc.nextLine();

            System.out.print("Option D: ");
            options[3] = sc.nextLine();

            System.out.print("Correct answer (A/B/C/D): ");
            char ans = Character.toUpperCase(sc.next().charAt(0));
            sc.nextLine();

            list.add(new Questions(q, options, ans));
        }

        return list;
    }
}
