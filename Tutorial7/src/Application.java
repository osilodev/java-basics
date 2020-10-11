import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Introduce un número:");
			numero = scanner.nextInt();
		} while(numero != 5);
		
		System.out.println("Escogiste 5");
	}

}
