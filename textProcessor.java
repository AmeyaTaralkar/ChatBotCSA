import java.util.*;
import java.io.*;
public class TextProcessor { // start class
   private String fileName;
   private ArrayList<String> textList;
   
   /**
     * Constructor to create a TextProcessor with a file.
     * @param fileName The name of the file to read.
     */
   
   public void addToFile() { // start addToFile method
      try { // start try
         File file = new File("expectedInput.txt");
         if(file.createNewFile())
            System.out.println("Created new file");
         else { //start else
            System.out.println("File exists!");
            System.exit(0);
         } // end else
         int number = 5;
         
         PrintWriter writer = new PrintWriter(file);
         writer.println("testing string");
         } // end try
         catch(Exception e)
         { // start catch
            System.out.println("Error");
         } // end catch
      } // end addToFile method
   } // end class
   
   //  public TextProcessor(String fileName) {
//       this.fileName = fileName;
//       this.textList = FileReaderUtil.toStringList(fileName);
//     }
// 
//     /**
//      * Constructor to create a TextProcessor with a list of text.
//      * @param textList The list of text.
//      */
//     public TextProcessor(ArrayList<String> textList) {
//       this.textList = textList;
//     }
// 
//     /**
//      * Gets the list of text.
//      * @return The list of text.
//      */
//     public ArrayList<String[]> getTextList() {
//       return textList;
//     }
// }
