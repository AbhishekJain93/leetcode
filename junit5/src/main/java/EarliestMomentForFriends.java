import java.util.Arrays;

public class EarliestMomentForFriends {
	public int earliestAcq(int[][] logs, int n) {
		Arrays.sort(logs,
				(int[] a1, int[] a2) -> Integer.compare(a1[0], a2[0]));

		DisjointSet dSet = new DisjointSet(n);

		for (int i = 0; i < logs.length; i++) {
			if (dSet.union(logs[i][1], logs[i][2]) == n)
				return logs[i][0];
		}

		return -1;
	}
}

class DisjointSet {
	int[] parent;
	int[] size;

	public DisjointSet(int n) {
		parent = new int[n];
		size = new int[n];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	public int findSet(int i) {
		if (parent[i] == i)
			return i;

		int representative = findSet(parent[i]);
		parent[i] = representative;
		return representative;
	}

	public int union(int i, int j) {
		int parent_i = findSet(i);
		int parent_j = findSet(j);

		if (parent_i == parent_j)
			return size[parent_i];

		if (size[parent_i] > size[parent_j]) {
			parent[parent_j] = parent_i;
			size[parent_i] += size[parent_j];
			return size[parent_i];
		} else {
			parent[parent_i] = parent_j;
			size[parent_j] += size[parent_i];
			return size[parent_j];
		}
	}
}