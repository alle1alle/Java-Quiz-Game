/*
 * Main.java
 * Alexander Lindgren, alexander2000alle@gmail.com
 * 2024-01-14
 */

import java.util.ArrayList;

/**
 * The Main class is the entry point for the Java Quiz application.
 * It creates a list of questions and starts the quiz game.
 */
public class Main {
    public static void main(String[] args) {
        // Create a list of questions
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Which city is the capital of Sweden", "Stockholm", "London", "Oslo", "1"));
        questions.add(new Question("In which year did the Titanic sink", "1912", "1920", "1905", "1"));
        questions.add(new Question("What is the currency of Japan", "Won", "Yen", "Ringgit", "X"));
        questions.add(new Question(" In which year did the first manned moon landing occur", "1969", "1975", "1982", "1"));
        questions.add(new Question("What is the chemical symbol for gold", "Ag", "Fe", "Au", "2"));
        questions.add(new Question("Which planet is known as the \"Red Planet\"", "Venus", "Jupiter", "Mars", "2"));
        questions.add(new Question("Which city is the capital of Australia", "Sydney", "Canberra", "Melbourne", "X"));
        questions.add(new Question("What is the capital of Brazil", "Brasilia", "Buenos Aires", "Rio de Janeiro", "1"));
        questions.add(new Question("What is the world's largest mammal", "Elephant", "Blue Whale", "Giraffe", "X"));
        questions.add(new Question("Which city is the capital of Norway", "Vienna", "Berlin", "Oslo", "2"));

        // Creates a Quiz instance
        Quiz quizGame = new Quiz(questions);
        // Starts the quiz game
        quizGame.playQuiz();
    }
    
}