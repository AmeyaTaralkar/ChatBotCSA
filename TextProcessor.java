import java.util.*;
import java.io.*;

/**
 * TextProcessor class to handle reading and processing text data.
 */
public class TextProcessor 
{//start class
    private java.util.Map<String, String> keywords;

    public TextProcessor() {
        keywords = loadKeywords("keywords.txt");
    }

    /**
     * Loads keywords and responses from a text file.
     * @param filePath Path to the keywords file.
     * @return A map of keywords and responses.
     */
    private java.util.Map<String, String> loadKeywords(String filePath) {
        java.util.Map<String, String> map = new java.util.HashMap<>();
        try {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    map.put(parts[0].trim().toLowerCase(), parts[1].trim());
                }
            }
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("Error loading keywords: " + e.getMessage());
        }
        return map;
    }

    /**
     * Finds a response based on user input.
     * @param userInput The user input.
     * @return A matching response or a default response.
     */
    public String getResponse(String userInput) {
        for (String key : keywords.keySet()) {
            if (userInput.toLowerCase().contains(key)) {
                return keywords.get(key);
            }
        }
        return "I'm not sure how to respond to that.";
    }

}//end class
