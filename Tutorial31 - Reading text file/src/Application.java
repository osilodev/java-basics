import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		//String filename = "C:/Users/Orlando/Desktop/java topics.txt";
		String filename = "java topics.txt";
		File textFile = new File(filename);
		Scanner in = new Scanner(textFile);
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();
	}

}
