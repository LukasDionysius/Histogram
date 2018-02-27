package histogram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HistogramDriver {
  public static void main(String[] args) {
    
    String number; // Necessary to read large number as string so we can pick off first 'char'
    int firstNumber; // The single important number/'char'
    
    try{ // Try block

      Histogram histo = new Histogram(9);
      
      File data = new File("/Users/lukasmichaels/Documents/Histogram/MLBSalaries");
      Scanner scan = new Scanner(data);

      while (scan.hasNext()){
      	number = scan.nextLine();
      	Scanner firstNumScanner = new Scanner(number);
      	firstNumber = Character.getNumericValue(number.charAt(0));
      	histo.submit(firstNumber);
      }
      System.out.println(histo.toString());
    }
    catch(FileNotFoundException e){ // If cant find file
      System.out.println("File missing");
    }

  }
}
  
