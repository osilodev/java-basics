import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca un comando");
		String comando = input.nextLine();
		
		switch (comando) {
		case "encender" :
			System.out.println("La máquina se ha encendido!");
			break;
		case "apagar" :
			System.out.println("La máquina se ha apagado.");
			break;
		default:
			System.out.println("Comando no reconocido");
		}
		
	}

}
