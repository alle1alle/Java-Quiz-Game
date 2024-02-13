/*
 * Question.java
 * Alexander Lindgren, alexander2000alle@gmail.com
 * 2024-01-14
 */

/**
 * The Question class represents a single quiz question with multiple-choice options.
 * It stores the question, answer choices, and the correct answer.
 */
public class Question {
    String question;
    String correctAnswer;
    String option1;
    String optionX;
    String option2;

    public Question(String question, String option1, String optionX, String option2, String correctAnswer) {
        this.question = question;
        this.option1 = option1;
        this.optionX = optionX;
        this.option2 = option2;
        this.correctAnswer = correctAnswer;
    }
    
}
