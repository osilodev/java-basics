class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("Oh no!");
	}
	
}

public class Application {

	public static void main(String[] args) {
		try(Temp temp1 = new Temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
