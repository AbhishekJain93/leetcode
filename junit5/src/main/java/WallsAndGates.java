import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
	public void wallsAndGates(int[][] rooms) {

		Queue<Pair> q = new LinkedList<>();

		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				if (rooms[i][j] == 0) {
					q.offer(new Pair(i, j));
				}
			}
		}

		int distance = 1;
		while (!q.isEmpty()) {
			int sz = q.size();
			for (int i = 0; i < sz; i++) {
				Pair coord = q.poll();
				if (processCoord(rooms, coord.x - 1, coord.y, distance))
					q.offer(new Pair(coord.x - 1, coord.y));
				if (processCoord(rooms, coord.x + 1, coord.y, distance))
					q.offer(new Pair(coord.x + 1, coord.y));
				if (processCoord(rooms, coord.x, coord.y - 1, distance))
					q.offer(new Pair(coord.x, coord.y - 1));
				if (processCoord(rooms, coord.x, coord.y + 1, distance))
					q.offer(new Pair(coord.x, coord.y + 1));
			}
			distance++;
		}

	}

	private boolean processCoord(int[][] rooms, int x, int y, int distance) {

		if (x < 0 || x >= rooms.length || y < 0 || y >= rooms[0].length || rooms[x][y] != Integer.MAX_VALUE)
			return false;

		rooms[x][y] = distance;
		return true;
	}
}
