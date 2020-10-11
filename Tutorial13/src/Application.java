class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello, my name is: " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Bob";
		person1.age = 50;
		System.out.println("Years till retirement " + person1.calculateYearsToRetirement());
		
		int age = person1.getAge();
		System.out.println("Age is: " + age);
		String name = person1.getName();
		System.out.println("Name is: " + name);
	}

}
