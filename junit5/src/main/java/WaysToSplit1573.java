public class WaysToSplit1573 {
	public int numWays(String s) {
		int ones = 0;
		long len = s.length();

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '1')
				ones++;
		}

		if (ones % 3 != 0)
			return 0;

		if (ones == 0) {
			return (int) (((len - 1) * (len - 2) / 2) % 1000000007); // first choose first split position ==> n-1
																		// choices, then for
			// second
			// split, n-2 choices as 1positon already taken by first split, also
			// since they are symmetric so divide by 2

		}

		int[] prefixSum = new int[s.length()];
		prefixSum[0] = s.charAt(0) == '0' ? 0 : 1;

		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + (s.charAt(i) == '0' ? 0 : 1);
		}

		long firstSplitPos = 0, secondSplitPos = 0;

		for (int i = 0; i < prefixSum.length; i++) {
			if (prefixSum[i] == ones / 3) {
				firstSplitPos++;
			} else if (prefixSum[i] == 2 * ones / 3) {
				secondSplitPos++;
			}
		}

		return (int) ((firstSplitPos * secondSplitPos) % 1000000007);
	}
}
