import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args){
		Person person = new Person(1, "Sue");
		Person.setCount(88);
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))){
			os.writeObject(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
