package randomLC;

public class DP_grid_alice_bob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maximumChocolates(int r, int c, int[][] grid) {
		// Write your code here.
		return f(grid, 0, 0, c-1);
	}

	private static int f(int[][] grid, int row, int j_alice, int j_bob) {
		
		if(j_alice == j_bob) {
			return grid[row][j_alice];
		}
		if(row > grid.length || j_alice < 0 || j_alice >= grid[0].length || j_bob < 0 || j_bob >= grid[0].length) {
			return Integer.MIN_VALUE;
		} 
		
		if(j_alice != j_bob) {
			return grid[row][j_alice] + grid[row][j_bob];
		}


		// int path1 = f(grid, row+1,j_alice-1, j_bob-1);
		// int path2 = f(grid, row+1,j_alice-1, j_bob);
		// int path3 = f(grid, row+1,j_alice-1, j_bob+1);
		// int path4 = f(grid, row+1,j_alice, j_bob-1);
		// int path5 = f(grid, row+1,j_alice, j_bob);
		// int path6 = f(grid, row+1,j_alice, j_bob+1);
		// int path7 = f(grid, row+1,j_alice+1, j_bob-1);
		// int path8 = f(grid, row+1,j_alice+1, j_bob);
		// int path9 = f(grid, row+1,j_alice+1, j_bob+1);
		int max = Integer.MIN_VALUE;
		int pathCost = 0;
		for(int i=-1; i<=1; i++) {
			for(int j=-1; j<=1; j++) {
				pathCost += f(grid,row+1,j_alice+i,j_bob+j); 
				if(pathCost > max) {
					max = pathCost;
				}
			}
		}

		return max;
	}
}
