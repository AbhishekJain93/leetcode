import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;

public class ParallelCourses {
	public int minimumSemesters3(int n, int[][] relations) {
		List<List<Integer>> adj = new ArrayList<>();
		Map<Integer, Integer> indegree = new HashMap<>();

		adj.add(new ArrayList<>()); // neded as nodes start from 1 not from 0;
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			indegree.put(i + 1, 0);
		}

		for (int i = 0; i < relations.length; i++) {
			adj.get(relations[i][0]).add(relations[i][1]);
			indegree.put(relations[i][1], indegree.get(relations[i][1]) + 1);
		}

		int clock = 0;
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		for (Entry<Integer, Integer> e : indegree.entrySet()) {
			if (e.getValue() == 0) {
				queue.offer(e.getKey());
				visited.add(e.getKey());
			}
		}

		while (!queue.isEmpty()) {
			clock++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int node = queue.poll();
				for (int j = 0; j < adj.get(node).size(); j++) {
					int in = indegree.get(adj.get(node).get(j));
					indegree.put(adj.get(node).get(j), in - 1);
					if (in == 1) {
						queue.offer(adj.get(node).get(j));
						visited.add(adj.get(node).get(j));
					}
				}
			}
		}

		return visited.size() == n ? clock : -1;
	}
}
