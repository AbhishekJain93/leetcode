public class ShortestWay1055 {

	public int shortestWay2(String source, String target) {
		int count = 0;
		int tIndex = 0;
		while (tIndex < target.length()) {
			int start = tIndex;
			for (int i = 0; i < source.length(); i++) {
				if (tIndex < target.length() && target.charAt(tIndex) == source.charAt(i)) {
					tIndex++;
				}
			}
			if (tIndex == start) { /* if target index have not change, means nothing can match this char */
				return -1;
			}
			count++;
		}
		return count;
	}

	public int shortestWay(String source, String target) {

		boolean[] check = new boolean[26];
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			check[c - 'a'] = true;
		}

		for (int i = 0; i < target.length(); i++) {
			char c = target.charAt(i);
			if (check[c - 'a'] == false) {
				return -1;
			}
		}

		int[][] dp = new int[target.length()][target.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -2;
			}
		}

		return dpHelper(source, target, 0, target.length() - 1, dp);

	}

	private int dpHelper(String source, String target, int start, int end, int[][] dp) {
		if (start > end)
			return 0;

		if (dp[start][end] != -2)
			return dp[start][end];

		int min = Integer.MAX_VALUE;
		for (int i = start; i <= end; i++) {
			if (isSubSequence(source, target, start, i, dp)) {
				int shortestWayRemaining = dpHelper(source, target, i + 1, end, dp);
				if (shortestWayRemaining != -1)
					min = Math.min(min, 1 + shortestWayRemaining);
			}
		}

		if (min == Integer.MAX_VALUE) {
			dp[start][end] = -1;
			return -1;
		}

		dp[start][end] = min;
		return min;
	}

	private boolean isSubSequence(String source, String target, int start, int end, int[][] dp) {
		if (dp[start][end] == 1)
			return true;

		int i1 = 0, i2 = start;

		while (i1 < source.length() && i2 <= end) {
			if (source.charAt(i1) == target.charAt(i2)) {
				i1++;
				i2++;
			} else {
				i1++;
			}
		}

		if (i2 > end) {
			dp[start][end] = 1;
			return true;
		}

		return false;
	}

}
