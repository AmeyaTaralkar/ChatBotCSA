import java.util.*;
public class textProcessor 
{
	private String fileName;
    private ArrayList<String> textList;

    /**
     * Constructor to create a TextProcessor with a file.
     * @param fileName The name of the file to read.
     */
    public TextProcessor(String fileName) {
        this.fileName = fileName;
        this.textList = FileReaderUtil.toStringList(fileName);
    }

    /**
     * Constructor to create a TextProcessor with a list of text.
     * @param textList The list of text.
     */
    public TextProcessor(ArrayList<String> textList) {
        this.textList = textList;
    }

    /**
     * Gets the list of text.
     * @return The list of text.
     */
    public ArrayList<String> getTextList() {
        return textList;
    }
	
}
