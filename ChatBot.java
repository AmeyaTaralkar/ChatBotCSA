import java.util.*;
import java.util.regex.Pattern;
public class ChatBot extends TextProcessor { // start class
   public static void main(String[] args) { // start main method
      boolean check = true;
      Scanner scan = new Scanner(System.in);
      while(check) { // start while loop
         System.out.println("Hi! Welcome to the companion chatbot! Hahaha. What is your name mate?");
         
         String nameOfUser = scan.nextLine();
         if(nameOfUser.equalsIgnoreCase("exit") || nameOfUser.equalsIgnoreCase("goodbye")) {
            System.out.println("Goodbye user");
            break;
         }
         System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today?");
         String moodInput = scan.nextLine();
         
         if(moodInput.equalsIgnoreCase("good") || moodInput.equalsIgnoreCase("great") || moodInput.equalsIgnoreCase("well") || moodInput.equalsIgnoreCase("ok"))
            System.out.println("That is awesome to hear! I am doing well too. Want to hear a joke?");
         else
            System.out.println("Can you repeat that? Make sure there are no typos in your response");
            
         String jokeInput = scan.nextLine();
         if(jokeInput.equalsIgnoreCase("sure") || jokeInput.equalsIgnoreCase("ok") || jokeInput.equalsIgnoreCase("yes"))
            System.out.println("Joke: Why shouldn't you fundraise for marathons?");
            String nextJokeInput = scan.nextLine();
            nextJokeInput = nextJokeInput.toUpperCase();
            char expectedChar = 'W';
            char secondExpectedChar = 'I';
            char firstLetter = nextJokeInput.charAt(0);
            if(firstLetter == expectedChar || firstLetter == secondExpectedChar)
               System.out.println("Because they just take the money and run");
            
         else {
            System.out.println("Ok. No joke then. What do you want to learn about?");
         }
         System.out.println("Do you want to hear another joke? Yes or no?");
         String secondJoke = scan.nextLine();
         boolean jokeQuestion = Pattern.matches("yes", secondJoke.toLowerCase());
         if(jokeQuestion)
            System.out.println("How much do rainbows weigh?");
            String secondJokeInput = scan.nextLine();
            boolean secondJokeQuestion = Pattern.matches(".*\\bhow much\\b.*", secondJokeInput.toLowerCase());
            if(secondJokeQuestion)
               System.out.println("Nothing. They're pretty light.");
            System.out.println("What do you want to talk about? Anything topic you are interested in? " + nameOfUser);
            String userFirstInput = scan.nextLine();
      } // end while loop
   }// end main method
}// end class
