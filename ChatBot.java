/**
 * This file creates the ChatBot object, giving it functionalities
 * such as running the program and interpreting text to choose 
 * what to reply to
 * 
 * 
 */

import java.util.*;
import java.util.regex.Pattern;

public class ChatBot
{ // start class
  private TextProcessor textProcessor;

    public ChatBot() {
        textProcessor = new TextProcessor();
    }

    /**
     * Starts the chatbot interaction.
     */
    public void start() {
		System.out.println("Welcome to the companion chatbot! Hahaha. What is your name mate?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nameOfUser = scanner.nextLine();
		System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today? Type 'exit' to quit.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! See you next time!");
                break;
            }

            String response = textProcessor.getResponse(userInput);
            System.out.println("Sertheya: " + response);
        }

        scanner.close();
    }
}// end class
