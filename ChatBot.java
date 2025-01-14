/**
 * This file creates the ChatBot object, giving it functionalities
 * such as running the program and interpreting text to choose 
 * what to reply to
 */

import java.util.*;
import java.util.regex.Pattern;
/**
 * ChatBot class to represent a simple interactive chatbot.
 * Provides functionalities to interact with users, interpret input,
 * and respond based on predefined rules. Includes a mini-game for fun.
 */
public class ChatBot
{ // start class
    private TextProcessor textProcessor;
    public static Scanner scanner;
    public static String nameOfUser;
 /**
     * Constructs a new ChatBot object and initializes the text processor.
     */
    public ChatBot() {
        textProcessor = new TextProcessor();
    }

    /**
     * Starts the chatbot interaction loop. Prompts the user for their name,
     * continuously takes input, and responds appropriately until the user exits.
     */
    public void start() {
		System.out.println("Welcome to the companion chatbot! Hahaha. What is your name mate?");
        scanner = new java.util.Scanner(System.in);
        nameOfUser = scanner.nextLine();
		System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today? Type 'exit' to quit, and 'game' for a surprise.");
        while (true) {
            System.out.print(nameOfUser + ": ");
            String userInput = scanner.nextLine();

            String response = textProcessor.getResponse(userInput);
             if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! See you next time!");
                break;
            }
            
            else if (userInput.equalsIgnoreCase("game")){
				game();
				userInput = "";
			}
			else
				System.out.println("Sertheya: " + response);
        }

        scanner.close();
    }
    
    /**
     * Starts a game of rock-paper-scissors with the user.
     * Tracks the scores for the user and the bot and allows the user to exit anytime.
     */
     
    public void game() {
		
		int userWin = 0;
		int botWin = 0;
		int tie = 0;
		int round = 0;
		String choice = "";
		String botChoice;
		String[] choices = {"rock", "paper", "scissors"};
		
		boolean badInput = true;
		boolean run = true;
		
		System.out.println("Let's play a rock paper scissors game " + nameOfUser + "!");
		System.out.println("Type 'exit' whenever you want to leave. I'll keep track of scores!");
		
		while(run){
			round++;
			System.out.println("Make your choice wisely.");
			System.out.print(nameOfUser + ": ");
			
			while(badInput){
				choice = scanner.nextLine();
				choice.toLowerCase();
		
				if (choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("scissors"))
					badInput = false;
					
				else if(choice.equalsIgnoreCase("exit")){
					round--;
					System.out.println("Match status: \n" + "Rounds played: " + round + "\nTies: " + tie +"\nBot wins: " + botWin + "\nUser wins: " + userWin + "\n");
					badInput = false;
					run = false;
				}
					
				else{
					System.out.println("Sorry, but your input needs to be 'rock', 'paper', or 'scissors'");
					System.out.print(nameOfUser + ": ");
				}
			}
			
			// Reset variable
			badInput = true;
			
			// Chooses an option for the bot
			botChoice = choices[((int)(Math.random()*3))];
			
			/*
			 * Decision making for the winner, giving them
			 * a point and rerunning the loop again
			 */
				
			if(botChoice.equals(choice)){
				System.out.println("Tie! No points");
				tie++;
			}
				
			else if (botChoice.equals("rock")){
				if (choice.equals("paper")){
					System.out.println("You win, point for you :(");
					userWin++;
				}
				else if (choice.equals("scissors")){
					System.out.println("HAHAHA I WIN! Point for me!");
					botWin++;
				}
			}
			else if (botChoice.equals("paper")){
				if (choice.equals("scissors")){
					System.out.println("You win, point for you :(");
					userWin++;
				}
				else if (choice.equals("rock")){
					System.out.println("HAHAHA I WIN! Point for me!");
					botWin++;
				}
			}
			else if (botChoice.equals("scissors")){
				if (choice.equals("rock")){
					System.out.println("You win, point for you :(");
					userWin++;
				}
				else if (choice.equals("paper")){
					System.out.println("HAHAHA I WIN! Point for me!");
					botWin++;
				}
			}
			
		}
		
	}
}// end class
