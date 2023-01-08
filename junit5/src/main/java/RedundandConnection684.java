public class RedundandConnection684 {
	public int[] findRedundantConnection(int[][] edges) {
		DisjointSet dSet = new DisjointSet(edges.length + 1); // nodes are from 1 -> n and not from 0 -> n-1

		for (int[] is : edges) {
			if (dSet.findSet(is[0]) == dSet.findSet(is[1]))
				return is;

			dSet.union(is[0], is[1]);
		}

		return null;
	}
}
