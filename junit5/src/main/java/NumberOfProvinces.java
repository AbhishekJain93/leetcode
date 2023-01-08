import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
	public int findCircleNum(int[][] isConnected) {

		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < isConnected.length; i++) {
			adj.add(new ArrayList<>());
		}

		for (int i = 0; i < isConnected.length; i++) {
			for (int j = 0; j < isConnected[0].length; j++) {
				if (isConnected[i][j] == 1) {
					adj.get(i).add(j);
					adj.get(j).add(i);
				}
			}
		}

		int num = 0;
		boolean[] visited = new boolean[isConnected.length];
		for (int i = 0; i < isConnected.length; i++) {
			if (!visited[i]) {
				num++;
				dfs(adj, i, visited);
			}
		}

		return num;
	}

	private void dfs(List<List<Integer>> adj, int node, boolean[] visited) {
		if (visited[node])
			return;

		visited[node] = true;
		List<Integer> adjacent = adj.get(node);
		for (Integer n : adjacent) {
			dfs(adj, n, visited);
		}
	}
}
