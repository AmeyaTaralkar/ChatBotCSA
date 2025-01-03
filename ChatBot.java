import java.util.*;
public class ChatBot {
   public static void main(String[] args) {
   boolean check = true;
   Scanner scan = new Scanner(System.in);
   while(check) {
      System.out.println("Hi! Welcome to the companion chatbot! Hahaha. What is your name mate?");
      
      String nameOfUser = scan.nextLine();
      System.out.println("Nice to meet you " + nameOfUser + " comrade! How are you today?");
      String moodInput = scan.nextLine();
      if(moodInput.equalsIgnoreCase("good") || moodInput.equalsIgnoreCase("great") || moodInput.equalsIgnoreCase("well"))
         System.out.println("That is awesome to hear! Want to hear a joke?");
      
      String jokeInput = scan.nextLine();
      if(jokeInput.equalsIgnoreCase("sure") || jokeInput.equalsIgnoreCase("ok") || jokeInput.equalsIgnoreCase("yes"))
         System.out.println("Joke: Why shouldn't you fundraise for marathons? I will give you 10 seconds to think and then reveal the answer...");
         
      else if(jokeInput.equalsIgnoreCase("no") || jokeInput.equalsIgnoreCase("nah"))
         System.out.println("Ok. No joke then. What do you want to learn about?");
      }
   }
}
