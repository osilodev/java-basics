
public class Application {

	public static void main(String[] args) {
		
		// Inneficient.
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		// Efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		System.out.print("Here is some text.\tThat was a tab\nThat was a new line.");
		System.out.println(" More text.");
		System.out.printf("Total cost %d", 5);
		
	}

}
