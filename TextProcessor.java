import java.util.*;
public class textProcessor 
{
	private String fileName;
    private ArrayList<String> textList;

    /**
     * Constructor to create a TextProcessor with a file.
     * @param fileName The name of the file to read.
     */
	public textProcessor(String fileName) 
	{
		this.fileName = fileName;
		textList = FileReader.toStringList(fileName);
	}

    /**
     * Constructor to create a TextProcessor with a list of text.
     * @param textList The list of text.
     */
   public textProcessor(ArrayList<String> textList)
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
 
	
}
