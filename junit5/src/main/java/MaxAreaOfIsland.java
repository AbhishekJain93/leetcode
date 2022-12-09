public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					max = Math.max(max, islandHelper(grid, i, j));
				}
			}
		}
		return max;
	}

	public int islandHelper(int[][] grid, int i, int j) {
		if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] != 1)
			return 0;

		int size = 1;
		grid[i][j] = 2;

		if (i > 0)
			size += islandHelper(grid, i - 1, j);
		if (i < grid.length - 1)
			size += islandHelper(grid, i + 1, j);
		if (j > 0)
			size += islandHelper(grid, i, j - 1);
		if (j < grid[0].length - 1)
			size += islandHelper(grid, i, j + 1);

		return size;
	}
}
