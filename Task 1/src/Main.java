import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	  public static void main(String[] args) {
		  try {
			  ReadFile r = new ReadFile();
			  ArrayList<String> data = r.readFile();
			  String[] stringArray = data.toArray(new String[0]);
			  int response = new RPN().RPNalgorithm(stringArray);
			  System.out.println(response);
		  }
		  
		  catch (FileNotFoundException e) {
			  System.out.println("An error occurred.");
			  e.printStackTrace();
		  }
	  }
	}