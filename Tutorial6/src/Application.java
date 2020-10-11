import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		int valor = input.nextInt();
		
		System.out.println("The value you entered is " + valor);
	}
}
