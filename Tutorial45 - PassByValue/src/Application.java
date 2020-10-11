
public class Application {
	public static void main(String[] args) {
		Application application = new Application();
		
		int value = 7;
		System.out.println("1. Value is: " + value);
		application.show(value);
		System.out.println("4. Value is: " + value);
		
		
		Person person = new Person("Bob");
		
		System.out.println("5. Value is: " + person);
		application.show(person);
		System.out.println("8. Value is: " + person);
	}
	
	public void show(int value) {
		System.out.println("2. Value is: " + value);
		value = 8;
		System.out.println("3. Value is: " + value);
	}
	
	public void show(Person person) {
		System.out.println("6. Value is: " + person);
		person = new Person("Lazar");
		System.out.println("7. Value is: " + person);
	}
}
