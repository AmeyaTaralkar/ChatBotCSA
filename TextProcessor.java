import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * TextProcessor class to handle reading and processing text data.
 */
public class TextProcessor 
{//start class
    private String fileName;
    private ArrayList<String> textList;

    /**
     * Constructor to create a TextProcessor with a file.
     * @param fileName The name of the file to read.
     */
    public TextProcessor(String fileName) 
    {
        this.fileName = fileName;
        this.textList = new ArrayList<>();
        readFile();
    }

    /**
     * Constructor to create a TextProcessor with a list of text.
     * @param textList The list of text.
     */
    public TextProcessor(ArrayList<String> textList) 
    {
        this.textList = textList;
    }

    /**
     * Gets the list of text.
     * @return The list of text.
     */
    public ArrayList<String> getTextList() 
    {
        return textList;
    }

    /**
     * Reads the file and populates the textList.
     */
    private void readFile() 
    {//start read file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {//start try
            String line;
            while ((line = br.readLine()) != null) 
            {//start while
                textList.add(line);
            }//end while
        }//end try
        catch (IOException e) 
        {//start catch
            System.err.println("Error reading file");
        }//end catch
    }//end read file
}//end class
