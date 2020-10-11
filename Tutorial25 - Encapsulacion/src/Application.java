class Plant {
	public static final int ID = 7;
	private String name;
	
	public String getData() {
		return "Id: " + ID + " nombre: " + name;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Application {

	public static void main(String[] args) {
		Plant plant = new Plant();
		plant.setName("Neem");
		System.out.println(plant.getData());
	}

}
