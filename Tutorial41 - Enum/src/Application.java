
public class Application {

	public static void main(String[] args) {
		Animal animal = Animal.DOG;
		
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
	}

}
