
public class Application {
	public static void main(String[] args) {
		System.out.println(calculateFactorial(2));
	}
	
	private static int calculateFactorial(int value) {
		if (value == 1) {
			return 1;
		}
		return calculateFactorial(value-1) * value;
	}
}