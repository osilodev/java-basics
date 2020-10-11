public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera started.");
	}

	@Override
	public void doStuff() {
		System.out.println("Camera is taking photos.");
	}

	@Override
	public void shutdown() {
		System.out.println("Camera has shutdown.");
		
	}
	
}