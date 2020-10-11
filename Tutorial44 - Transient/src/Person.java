import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1150098568783815480L;
	private transient int id;
	private String name;
	private static int count;
	
	public Person() {
		System.out.println("Default constructor.");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two arguments constructor.");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
}
