import java.util.*;
public class textProcessor 
{
	private String fileName;
	private ArrayList<String> textList;
	public TextProcessor(String fileName)
	{
		this.fileName = fileName;
		textList = FileReader.toStringList(fileName);
	}
	public TextProcessor(ArrayList<String> textList) 
	{
		this.textList = textList;
	}
	public ArrayList<String> getTextList() 
	{
		return textList;
	}	
}
