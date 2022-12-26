public class MaxConsecutiveOnesIII {

	public int longestOnes(int[] nums, int k) {
		int zeroCount = 0, max = 0;
		int l = 0, r = 0;

		while (r < nums.length) {
			if (nums[r] == 1) {
				r++;
			} else {
				if (zeroCount < k) {
					zeroCount++;
					r++;
				} else {
					if (nums[l] == 0) {
						zeroCount--;
					}
					l++;
				}
			}
			if (r > l)
				max = Math.max(max, r - l);
		}

		return max;
	}
}
