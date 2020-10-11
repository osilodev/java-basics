
public class Application {

	public static void main(String[] args) {
		
		String[] text = {"One", "Two", "Three"};
		
		try {
			System.out.println(text[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
	}

}
