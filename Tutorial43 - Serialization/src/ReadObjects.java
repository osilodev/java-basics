import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("people.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayList<Person> peopleList = (ArrayList<Person>) oi.readObject();
			for (Person person: peopleList) {
				System.out.println(person);
			}
			oi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
