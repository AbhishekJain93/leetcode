import java.util.ArrayList;
import java.util.List;

public class AllPathSourceTarget {

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

		List<List<Integer>> paths = new ArrayList<>();
		dfs(graph, 0, new ArrayList<>(), paths);

		return paths;
	}

	private void dfs(int[][] graph, int node, List<Integer> current, List<List<Integer>> paths) {
		current.add(node);
		if (node == graph.length - 1) {
			paths.add(new ArrayList<>(current));
		}

		for (int i = 0; i < graph[node].length; i++) {
			dfs(graph, graph[node][i], current, paths);
		}

		current.remove(current.size() - 1);
	}
}
