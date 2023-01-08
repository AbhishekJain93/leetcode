import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillProcess582 {
	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		Map<Integer, List<Integer>> adj = new HashMap<>();

		for (int i = 0; i < pid.size(); i++) {
			if (ppid.get(i).equals(0))
				continue;

			adj.putIfAbsent(ppid.get(i), new ArrayList<>());
			adj.get(ppid.get(i)).add(pid.get(i));
		}

		List<Integer> result = new ArrayList<>();
		dfs(adj, kill, result);

		return result;
	}

	private void dfs(Map<Integer, List<Integer>> adj, int kill, List<Integer> result) {
		result.add(kill);

		List<Integer> children = adj.get(kill);
		if (children == null)
			return;

		for (int i = 0; i < children.size(); i++) {
			dfs(adj, children.get(i), result);
		}
	}
}
