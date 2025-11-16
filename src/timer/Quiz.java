
package timer;

import java.util.*;

import questions.Questions;

public class Quiz{

    public static void startQuiz(ArrayList<Questions> list) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (Questions q : list) {
            System.out.println("\n" + q.question);
            System.out.println("A. " + q.option[0]);
            System.out.println("B. " + q.option[1]);
            System.out.println("C. " + q.option[2]);
            System.out.println("D. " + q.option[3]);

            System.out.println("You have 10 seconds...");
            long startTime = System.currentTimeMillis();

            System.out.print("Enter answer: ");

            while (!sc.hasNextLine()) {}

            String input = sc.nextLine().toUpperCase();

            long endTime = System.currentTimeMillis();
            long taken = (endTime - startTime) / 1000;

            if (taken > 10) {
                System.out.println(" Time Up! You took " + taken + " seconds.");
                continue;
            }

            char userAns = input.charAt(0);

            if (userAns == q.answer) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println("X Wrong!");
            }
        }

        System.out.println("\nYour Score: " + score + "/" + list.size());
    }
}
