import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule207 {

	// 0,1,2,3 ... n-1
	public boolean canFinish(int numCourses, int[][] prerequisites) {

		Map<Integer, Integer> indegree = new HashMap<>();
		Map<Integer, List<Integer>> adj = new HashMap<>();

		for (int i = 0; i < numCourses; i++) {
			adj.put(i, new ArrayList<>());
			indegree.put(i, 0);
		}

		for (int[] edge : prerequisites) {
			indegree.put(edge[0], indegree.getOrDefault(edge[0], 0) + 1);
			adj.get(edge[1]).add(edge[0]);
		}

		Queue<Integer> q = new LinkedList<>();
		for (java.util.Map.Entry<Integer, Integer> e : indegree.entrySet()) {
			if (e.getValue() == 0) {
				q.offer(e.getKey());
			}
		}

		while (!q.isEmpty()) {
			int node = q.poll();
			for (int child : adj.get(node)) {
				int indegreeChild = indegree.get(child);
				if (indegreeChild == 1)
					q.offer(child);
				indegree.put(child, indegreeChild - 1);
			}
		}

		for (java.util.Map.Entry<Integer, Integer> e : indegree.entrySet()) {
			if (e.getValue() != 0)
				return false;
		}
		return true;
	}
}
