class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return String.format("%4d: %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(": ");
		sb.append(name);
		return sb.toString();*/
	}
}

public class Application {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Bob");
		Frog frog2 = new Frog(8, "Pippy");
		Frog frog3 = new Frog(9, "Robin");
		Frog frog4 = new Frog(10, "Laggy");
		System.out.println(frog1.toString());
		System.out.println(frog2.toString());
		System.out.println(frog3.toString());
		System.out.println(frog4.toString());
	}

}
