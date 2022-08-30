import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
	public ArrayList<String> readFile()throws FileNotFoundException {
		ArrayList<String> datas = new ArrayList<String>();
		String f = System.getProperty("user.dir")+"\\src\\Calc1.txt";
		File myObj = new File(f);
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
	        datas.add(data);
	        System.out.println(data);
	      }
	      myReader.close();
	      return datas;
	}
}