
public class Application {

	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = new Tree();
		
		plant2.grow();
		tree.shedLeaves();
		doGrow(plant);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
