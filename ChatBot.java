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
    public static Scanner scanner;
    public static String nameOfUser;

    public ChatBot() {
        textProcessor = new TextProcessor();
    }

    /**
     * Starts the chatbot interaction.
     */
    public void start() {
		System.out.println("Welcome to the companion chatbot! Hahaha. What is your name mate?");
        scanner = new java.util.Scanner(System.in);
        nameOfUser = scanner.nextLine();
		System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today? Type 'exit' to quit, and 'game' for a surprise.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! See you next time!");
                break;
            }
            
            else if (userInput.equalsIgnoreCase("game"));
				game();

            String response = textProcessor.getResponse(userInput);
            System.out.println("Sertheya: " + response);
        }

        scanner.close();
    }
    
    /**
     * Starts a game of rock paper scissors with the user 
     */
     
    public void game() {
		
		int userWin = 0;
		int botWin = 0;
		int round = 0;
		String input = "";
		String[] choices = {"rock", "paper", "scissors"};
		String choice;
		boolean validInput = false;
		
		System.out.println("Let's play a rock paper scissors game " + nameOfUser + "!");
		System.out.println("Type 'exit' whenever you want to leave. I'll keep track of scores!");
		
		while(input != "exit"){
			System.out.println("Make your choice wisely.");
			
			while(!validInput){
				input = scanner.nextLine();
				input.toLowerCase();
				if (input != "rock" || input!= "paper" || input != "scissors")
					System.out.println("Sorry, but your input needs to be 'rock', 'paper', or 'scissors'");
				else
					validInput = true;
			}
			
			
			
			choice = choices[(int)(Math.random()*3)];
		}
		
		
	}
}// end class
