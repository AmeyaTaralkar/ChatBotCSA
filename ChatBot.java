import java.util.*;
import java.util.regex.Pattern;

public class ChatBot { // start class

      private boolean check;
      private Scanner scan;

      public ChatBot() {
         check = true;
         scan = new Scanner(System.in);

      }

      public void start() {
         while (check) { // start while loop
            System.out.println("Hi! Welcome to the companion chatbot! Hahaha. What is your name mate?");

            String nameOfUser = scan.nextLine();
            System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today?");
            String moodInput = scan.nextLine();

            if (moodInput.equalsIgnoreCase("good") || moodInput.equalsIgnoreCase("great") || moodInput.equalsIgnoreCase("well"))
               System.out.println("That is awesome to hear! Want to hear a joke?");
            else
               System.out.println("Can you repeat that? Make sure there are no typos in your response");

            String jokeInput = scan.nextLine();
            if (jokeInput.equalsIgnoreCase("sure") || jokeInput.equalsIgnoreCase("ok") || jokeInput.equalsIgnoreCase("yes"))
               System.out.println("Joke: Why shouldn't you fundraise for marathons?");
            String nextJokeInput = scan.nextLine();
            nextJokeInput = nextJokeInput.toUpperCase();
            char expectedChar = 'W';
            char secondExpectedChar = 'I';
            char firstLetter = nextJokeInput.charAt(0);
            if (firstLetter == expectedChar || firstLetter == secondExpectedChar)
               System.out.println("Because they just take the money and run");

            else if (jokeInput.equalsIgnoreCase("no") || jokeInput.equalsIgnoreCase("nah"))
               System.out.println("Ok. No joke then. What do you want to learn about?");
            System.out.println("Do you want to hear another joke? Yes or no?");
            String secondJokeInput = scan.nextLine();
            System.out.println(Pattern.matches(secondJokeInput, "yes"));

         } // end while loop
      }
}// end class
