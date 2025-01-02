import java.util.*;
public class ChatBot {
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
      System.out.println("Hi! Hahaha. What is your name mate?");
      
      String nameOfUser = scan.nextLine();
      System.out.println("Nice to meet you " + nameOfUser + " comrade!");
   }
}