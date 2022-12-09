import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Triangle {

	public int minimumTotal2(List<List<Integer>> triangle) {

		int[] dp = new int[triangle.get(triangle.size() - 1).size() + 1];

		for (int i = triangle.size() - 1; i > -1; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++) {
				dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
			}
		}

		return dp[0];
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		return totalHelper(triangle, 0, 0, triangle.get(0).get(0), new HashMap<>());
	}

	private int totalHelper(List<List<Integer>> triangle, int i, int j, int currentSum, Map<Triplet, Integer> map) {
		Triplet key = new Triplet(i, j, currentSum);
		if (map.containsKey(key)) {
			return map.get(key);
		}

		if (i >= triangle.size() - 1)
			return currentSum;

		int result = Math.min(totalHelper(triangle, i + 1, j, currentSum + triangle.get(i + 1).get(j), map),
				totalHelper(triangle, i + 1, j + 1, currentSum + triangle.get(i + 1).get(j + 1), map));

		map.put(new Triplet(i, j, currentSum), result);
		return result;
	}

}

class Triplet {
	int i;
	int j;
	int k;

	public Triplet(int x, int y, int z) {
		i = x;
		j = y;
		k = z;
	}
}
