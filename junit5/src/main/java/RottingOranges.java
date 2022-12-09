import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {
	public int orangesRotting(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];

		Queue<Coordinates> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2 && !visited[i][j]) {
					queue.add(new Coordinates(i, j));
					visited[i][j] = true;

				}
			}
		}

		int counter = -1;
		while (!queue.isEmpty()) {
			List<Coordinates> list = new ArrayList<>();

			while (!queue.isEmpty()) {
				list.add(queue.poll());
			}

			for (Coordinates c : list) {
				if (c.i > 0 && grid[c.i - 1][c.j] == 1 && !visited[c.i - 1][c.j]) {
					grid[c.i - 1][c.j] = 2;
					visited[c.i - 1][c.j] = true;
					queue.add(new Coordinates(c.i - 1, c.j));
				}

				if (c.i < grid.length - 1 && grid[c.i + 1][c.j] == 1 && !visited[c.i + 1][c.j]) {
					grid[c.i + 1][c.j] = 2;
					visited[c.i + 1][c.j] = true;
					queue.add(new Coordinates(c.i + 1, c.j));
				}
				if (c.j > 0 && grid[c.i][c.j - 1] == 1 && !visited[c.i][c.j - 1]) {
					grid[c.i][c.j - 1] = 2;
					visited[c.i][c.j - 1] = true;
					queue.add(new Coordinates(c.i, c.j - 1));
				}
				if (c.j < grid[0].length - 1 && grid[c.i][c.j + 1] == 1 && !visited[c.i][c.j + 1]) {
					grid[c.i][c.j + 1] = 2;
					visited[c.i][c.j + 1] = true;
					queue.add(new Coordinates(c.i, c.j + 1));
				}
			}
			counter += 1;
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1)
					return -1;
			}
		}

		return counter == -1 ? 0 : counter;

	}
}

class Coordinates {
	int i;
	int j;

	public Coordinates(int x, int y) {
		i = x;
		j = y;
	}
}
