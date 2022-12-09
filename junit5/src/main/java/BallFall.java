public class BallFall {

	public int[] findBall(int[][] grid) {
		int[][] result = new int[grid.length][grid[0].length];

		for (int j = 0; j < grid[0].length; j++) {
			if (grid[grid.length - 1][j] == -1 && j == 0)
				result[grid.length - 1][j] = -1;

			else if (grid[grid.length - 1][j] == -1 && grid[grid.length - 1][j - 1] == 1)
				result[grid.length - 1][j] = -1;

			else if (grid[grid.length - 1][j] == 1 && j == grid[0].length - 1)
				result[grid.length - 1][j] = -1;

			else if (grid[grid.length - 1][j] == 1 && grid[grid.length - 1][j + 1] == -1)
				result[grid.length - 1][j] = -1;

			else if (grid[grid.length - 1][j] == -1)
				result[grid.length - 1][j] = j - 1;

			else if (grid[grid.length - 1][j] == 1)
				result[grid.length - 1][j] = j + 1;
		}

		for (int i = grid.length - 2; i >= 0; i--) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == -1 && j == 0)
					result[i][j] = -1;

				else if (grid[i][j] == -1 && grid[i][j - 1] == 1)
					result[i][j] = -1;

				else if (grid[i][j] == -1 && grid[i][j - 1] == -1)
					result[i][j] = result[i + 1][j - 1];

				else if (grid[i][j] == 1 && j == grid[0].length - 1)
					result[i][j] = -1;

				else if (grid[i][j] == 1 && grid[i][j + 1] == -1)
					result[i][j] = -1;

				else if (grid[i][j] == 1 && grid[i][j + 1] == 1)
					result[i][j] = result[i + 1][j + 1];
			}
		}

		return result[0];
	}
}
