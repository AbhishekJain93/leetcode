import java.util.Arrays;

public class FairDistributionOfCookie2305 {

	public int distributeCookies(int[] cookies, int k) {
		int[] dp = new int[k];

		int[] distribution = distributeCookiesHelper(cookies, dp, 0, k);

		int localMax = Integer.MIN_VALUE;
		for (int j = 0; j < distribution.length; j++) {
			localMax = Math.max(localMax, distribution[j]);
		}

		return localMax;
	}

	private int[] distributeCookiesHelper(int[] cookies, int[] dp, int idx, int k) {
		if (idx == cookies.length)
			return dp;

		int max = Integer.MAX_VALUE;
		int[] res = new int[k];

		for (int i = 0; i < dp.length; i++) {
			dp[i] += cookies[idx];
			int[] distribution = distributeCookiesHelper(cookies, dp, idx + 1, k);

			int localMax = Integer.MIN_VALUE;
			for (int j = 0; j < distribution.length; j++) {
				localMax = Math.max(localMax, distribution[j]);
			}

			if (localMax < max) {
				max = localMax;
				res = Arrays.copyOf(distribution, k);
			}

			dp[i] -= cookies[idx];
		}

		return res;
	}
}
