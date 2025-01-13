import java.util.*;
import java.io.*;

/**
 * TextProcessor class to handle reading and processing text data.
 */
public class TextProcessor 
{ //start class
    private String fileName;
    private ArrayList<String> textList = new ArrayList<>();
    /**
     * Reads the file and populates the textList.
     * @param userInput The user's chatbot input
     */
    public boolean checkKeyWords(String userInput) { //start checkKeyWords method
      for(String keyword : textList) { //start for loop
         if(userInput.toLowerCase().contains(keyword)) { // start if statement
            return true;
         } // end if statement
      } // end for loop
      return false;
    } //end checkKeyWords method
} //end class
