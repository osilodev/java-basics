
class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello my name is " + name + " i am " + age + " years old");
	}
}

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Bob Lazar";
		person1.age = 30;
		
		Person person2 = new Person();
		person2.name = "George Knapp";
		person2.age = 40;
		
		person1.speak();
		person2.speak();
	}

}
