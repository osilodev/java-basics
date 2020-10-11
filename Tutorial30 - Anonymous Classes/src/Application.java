class Machine{
	public void start() {
		System.out.println("Starting Machine!");
	}
}

interface Plant{
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Starting Camera!");
			}
		};
		machine1.start();
		
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing!");
			}
		};
		
		plant1.grow();
	}
	
}
