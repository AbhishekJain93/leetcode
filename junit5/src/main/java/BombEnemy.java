public class BombEnemy {
	public int maxKilledEnemies(char[][] grid) {
		int[][] top = new int[grid.length][grid[0].length];
		int[][] bottom = new int[grid.length][grid[0].length];
		int[][] left = new int[grid.length][grid[0].length];
		int[][] right = new int[grid.length][grid[0].length];

		// top
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 'W')
					continue;
				else if (i == 0 && grid[i][j] == 'E')
					top[i][j] = 1;
				else if (i == 0)
					top[i][j] = 0;
				else {
					top[i][j] = grid[i][j] == 'E' ? top[i - 1][j] + 1 : top[i - 1][j];
				}
			}
		}

		// left
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 'W')
					continue;
				else if (j == 0 && grid[i][j] == 'E')
					left[i][j] = 1;
				else if (j == 0)
					left[i][j] = 0;
				else {
					left[i][j] = grid[i][j] == 'E' ? left[i][j - 1] + 1 : left[i][j - 1];
				}
			}
		}

		// bottom
		for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[0].length - 1; j >= 0; j--) {
				if (grid[i][j] == 'W')
					continue;
				else if (i == grid.length - 1 && grid[i][j] == 'E')
					bottom[i][j] = 1;
				else if (i == grid.length - 1)
					bottom[i][j] = 0;
				else {
					bottom[i][j] = grid[i][j] == 'E' ? bottom[i + 1][j] + 1 : bottom[i + 1][j];
				}
			}
		}

		// right
		for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[0].length - 1; j >= 0; j--) {
				if (grid[i][j] == 'W')
					continue;
				else if (j == grid[0].length - 1 && grid[i][j] == 'E')
					right[i][j] = 1;
				else if (j == grid[0].length - 1)
					right[i][j] = 0;
				else {
					right[i][j] = grid[i][j] == 'E' ? right[i][j + 1] + 1 : right[i][j + 1];
				}
			}
		}

		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 'W' || grid[i][j] == 'E')
					continue;

				max = Math.max(max, top[i][j] + left[i][j] + bottom[i][j] + right[i][j]);
			}
		}

		return max;
	}
}
