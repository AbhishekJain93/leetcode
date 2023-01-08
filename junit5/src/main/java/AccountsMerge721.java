import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccountsMerge721 {
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		DisjointSet2 ds = new DisjointSet2(accounts.size());
		Map<String, Integer> mapping = new HashMap<>();

		for (int i = 0; i < accounts.size(); i++) {
			List<String> account = accounts.get(i);
			for (int j = 1; j < account.size(); j++) {
				if (!mapping.containsKey(account.get(j))) {
					mapping.put(account.get(j), i);
				} else {
					ds.union(i, mapping.get(account.get(j)));
				}
			}
		}

		Map<Integer, SortedSet<String>> sorted = new HashMap<>();
		for (java.util.Map.Entry<String, Integer> e : mapping.entrySet()) {
			int parent = ds.findSet(e.getValue());
			sorted.putIfAbsent(parent, new TreeSet<>());
			sorted.get(parent).add(e.getKey());
		}

		List<List<String>> result = new ArrayList<>();
		for (java.util.Map.Entry<Integer, SortedSet<String>> e : sorted.entrySet()) {
			List<String> resultEntry = new ArrayList<>();
			resultEntry.add(accounts.get(e.getKey()).get(0));
			e.getValue().stream().forEach((val) -> resultEntry.add(val));
			result.add(resultEntry);
		}

		return result;
	}
}

class DisjointSet2 {
	int[] parent;
	int[] size;

	public DisjointSet2(int n) {
		parent = new int[n];
		size = new int[n];

		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	public int findSet(int a) {
		if (a == parent[a])
			return a;

		int par = findSet(parent[a]);
		parent[a] = par;
		return par;
	}

	public int union(int a, int b) {
		int p_a = findSet(a);
		int p_b = findSet(b);
		if (p_a == p_b)
			return size[p_a];

		if (size[p_a] > size[p_b]) {
			parent[p_b] = p_a;
			size[p_a] += size[p_b];
			return size[p_a];
		} else {
			parent[p_a] = p_b;
			size[p_b] += size[p_a];
			return size[p_b];
		}
	}

}