/*
 * Quiz.java
 * Alexander Lindgren, alexander2000alle@gmail.com
 * 2024-01-14
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Quiz class represents a quiz game with a set of questions.
 * It allows users to play the quiz and keeps track of their score.
 */
public class Quiz {

    ArrayList<Question> questions;
    int score;

    /**
     * Constructs a Quiz object with a given list of questions.
     *
     * @param questions The list of questions for the quiz.
     */
    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    /**
     * Displays a given question to the user.
     *
     * @param question The Question object to be displayed.
     */
    public void displayQuestion(Question question) {
        System.out.println(question.question + "?");
        System.out.printf("- %-10s: 1\n", question.option1);
        System.out.printf("- %-10s: X\n", question.optionX);
        System.out.printf("- %-10s: 2\n", question.option2);
    }

    /**
     * Initiates the quiz and handles the gameplay.
     */
    public void playQuiz() {

        System.out.println("* * * * * * * * * * * *");
        System.out.println("* Welcome to JavaQuiz *");
        System.out.println("* * * * * * * * * * * *");

        Scanner scanner = new Scanner(System.in);
        int numQuestion = 1;
        for (Question question : questions) {
            System.out.println("---------------");
            System.out.println(String.format("Question %d of %d", numQuestion, questions.size()));
            System.out.println("---------------");
            System.out.println("Current score: " + score + "\n");
            numQuestion++;

            displayQuestion(question);

            boolean validAnswer = false;
            String userChoice = "";

            // Checking for valid user input
            while (!validAnswer) {
                System.out.print("Your choice (enter 1, X, or 2): ");
                String userInput = scanner.nextLine().trim().toUpperCase();

                switch (userInput) {
                    case "1":
                        userChoice = "1";
                        validAnswer = true;
                        break;
                    case "X":
                        userChoice = "X";
                        validAnswer = true;
                        break;
                    case "2":
                        userChoice = "2";
                        validAnswer = true;
                        break;
                    default:
                        System.out.println("Invalid input! Please enter 1, X, or 2.");
                }
            }

            // Check if the answer is correct or not
            if (userChoice.equals(question.correctAnswer)) {
                System.out.println("Correct! You earned a point.\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + question.correctAnswer + "\n");
            }
        }

        // Displaying the final score and a simple graphic if all questions were answered correctly
        if (score == questions.size()) {
            System.out.println("  |-----------|   ");
            System.out.println("   |         |    ");
            System.out.println("|--_|  1 st |_--| ");
            System.out.println(" --__|     |__--  ");
            System.out.println("      |   |       ");
            System.out.println("      |   |       ");
            System.out.println("     |_____|      ");
            System.out.println("                  ");
            System.out.println(String.format("     %d / %d", score, questions.size()));
        } else {
            System.out.println("---------------------------------------");
            System.out.println(String.format("Quiz completed! You got %d of %d points.", score, questions.size()));
            System.out.println("---------------------------------------");
        }

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
