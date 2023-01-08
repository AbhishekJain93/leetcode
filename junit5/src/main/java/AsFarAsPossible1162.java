import java.util.Arrays;

public class AsFarAsPossible1162 {
	public int maxDistance(int[][] grid) {
		int[][] min = new int[grid.length][grid[0].length];

		for (int i = 0; i < min.length; i++) {
			for (int j = 0; j < min[0].length; j++) {
				min[i][j] = grid[i][j] == 0 ? Integer.MAX_VALUE : 1; // this is done so that the relax step doesn't
																		// relax "1" as it would lead to TLE (though the
																		// solution works but unnecessary relaxations
																		// are avoided by this,
																		// can't check for grid[i][j] ==1 as we need to
																		// relax initial coordinate)
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1)
					relax(grid, i, j, 0, min);
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < min.length; i++) {
			for (int j = 0; j < min[0].length; j++) {
				max = Math.max(max, min[i][j]);
			}
		}

		if (max == 0 || max == Integer.MAX_VALUE)
			return -1;
		else
			return max;
	}

	private void relax(int[][] grid, int i, int j, int val, int[][] min) {
		if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1)
			return;

		if (min[i][j] <= val)
			return;

		min[i][j] = val;
		relax(grid, i + 1, j, val + 1, min);
		relax(grid, i - 1, j, val + 1, min);
		relax(grid, i, j + 1, val + 1, min);
		relax(grid, i, j - 1, val + 1, min);
	}
}
