
public class Application {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		Car car1 = new Car();
		
		cam1.setId(5);
		car1.setId(4);
		
		cam1.run();
		car1.run();
		
	}

}
