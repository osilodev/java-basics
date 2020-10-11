public class Application {

	public static void main(String[] args) {
		int[][] grid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int row = 0; row < grid.length; row++) {
			for (int col= 0; col < grid[row].length; col++) {
				System.out.println(grid[row][col]);
			}
		}
	}

}
