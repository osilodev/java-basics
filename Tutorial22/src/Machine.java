
public class Machine implements Info, Istartable{
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void showInfo() {
		System.out.println("Machine Id is: " + id);
	}

	@Override
	public void stop() {
		System.out.println("Machine stopped.");
	}
}
