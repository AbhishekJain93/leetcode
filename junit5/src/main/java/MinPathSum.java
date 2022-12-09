public class MinPathSum {
	public int minPathSum(int[][] grid) {
		int[][] min = new int[grid.length][grid[0].length];

		min[0][0] = grid[0][0];
		for (int i = 1; i < min[0].length; i++) {
			min[0][i] = min[0][i - 1] + grid[0][i];
		}

		for (int i = 1; i < min.length; i++) {
			min[i][0] = min[i - 1][0] + grid[i][0];
		}

		for (int i = 1; i < min.length; i++) {
			for (int j = 1; j < min[0].length; j++) {
				min[i][j] = grid[i][j] + Math.min(min[i - 1][j], min[i][j - 1]);
			}
		}

		return min[min.length - 1][min[0].length - 1];
	}
}
