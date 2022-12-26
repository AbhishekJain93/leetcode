import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindCelebrity {
	public int findCelebrity(int n) {
		List<List<Integer>> adj = new ArrayList<>();
		Map<Integer, Integer> indegree = new HashMap<>();

		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			indegree.put(i, 0);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (knows(i, j)) {
					adj.get(j).add(i);
					indegree.put(i, indegree.get(i) + 1);
				}
				if (knows(j, i)) {
					adj.get(i).add(j);
					indegree.put(j, indegree.get(j) + 1);
				}
			}
		}

		for (Entry<Integer, Integer> e : indegree.entrySet()) {
			if (e.getValue() == 0) {
				return adj.get(e.getKey()).size() == n - 1 ? e.getKey() : -1;
			}
		}

		return -1;
	}

	private boolean knows(int a, int b) {
		return false;
	}
}
