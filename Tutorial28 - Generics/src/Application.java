import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		String fruit = list.get(1).toString();
		System.out.println(fruit);
		
		
		// Método correcto moderno
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Cat");
		stringList.add("Dog");
		stringList.add("Aligator");
		
		String animal = stringList.get(1);
		System.out.println(animal);
	}

}
