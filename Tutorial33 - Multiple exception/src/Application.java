import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) {
		Test test = new Test();
		
		/*try {
			test.run();
		} catch (IOException e) {
			System.out.println("Couldn't open file.");
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}*/
		
		/*try {
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}*/
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			try {
				test.input();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
