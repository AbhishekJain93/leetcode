import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GraphValidTree261 {
	public boolean validTree(int n, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}

		for (int i = 0; i < edges.length; i++) {
			int[] e = edges[i];

			adj.get(e[0]).add(e[1]);
			adj.get(e[1]).add(e[0]);
		}

		HashSet<Integer> visited = new HashSet<>();

		if (dfs(adj, 0, visited)) // do dfs from any node, all nodes should be visited once exactly if tree
			return false;

		return visited.size() == n; // graph might contain disjoint islands
	}

	private boolean dfs(List<List<Integer>> adj, int v, HashSet<Integer> visited) {

		return dfsHelper(adj, v, -1, visited);

	}

	private boolean dfsHelper(List<List<Integer>> adj, int src, int parent, HashSet<Integer> visited) {
		if (visited.contains(src))
			return true;

		visited.add(src);

		List<Integer> neighbours = adj.get(src);

		for (int i : neighbours) {
			if (i == parent)
				continue;

			if (dfsHelper(adj, i, src, visited))
				return true;
		}

		return false;
	}
}
