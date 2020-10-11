import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		File file = new File("text.txt");

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("Primera linea");
			bw.newLine();
			bw.write("Segunda linea");
			bw.newLine();
			bw.write("Tercera linea");
			bw.close();
		} catch (IOException e) {
			System.out.println("Unable to create file: "  + file.toString());
		}
	}

}
