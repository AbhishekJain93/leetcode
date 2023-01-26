import java.util.ArrayList;
import java.util.List;

public class DetonateMaxBombs2101 {
	public int maximumDetonation(int[][] bombs) {
		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i < bombs.length; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int i = 0; i < bombs.length; i++) {
			for (int j = i + 1; j < bombs.length; j++) {
				if (isReachable(bombs[i], bombs[j]))
					adjList.get(i).add(j);

				if (isReachable(bombs[j], bombs[i]))
					adjList.get(j).add(i);
			}
		}

		int max = 0;
		for (int i = 0; i < adjList.size(); i++) {
			boolean[] visited = new boolean[adjList.size()];
			max = Math.max(max, dfs(adjList, visited, i));

		}

		return max;
	}

	private int dfs(List<List<Integer>> adjList, boolean[] visited, int idx) {
		if (visited[idx])
			return 0;

		visited[idx] = true;
		int count = 1;

		for (int i = 0; i < adjList.get(idx).size(); i++) {
			count += dfs(adjList, visited, adjList.get(idx).get(i));
		}

		return count;
	}

	private boolean isReachable(int[] bomb1, int[] bomb2) {
		if (Math.pow(bomb1[0] - bomb2[0], 2) + Math.pow(bomb1[1] - bomb2[1], 2) <= Math.pow(bomb1[2], 2))
			return true;

		return false;
	}
}
