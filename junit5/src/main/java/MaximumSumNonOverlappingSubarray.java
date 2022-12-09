public class MaximumSumNonOverlappingSubarray {
	public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

		return Math.max(
				maxSubArrayHelper(nums, firstLen, secondLen),
				maxSubArrayHelper(nums, secondLen, firstLen));
	}

	public int maxSubArrayHelper(int[] nums, int firstLen, int secondLen) {
		int[] maxPrefixForFirst = new int[nums.length];
		int current = 0;

		for (int i = 0; i < maxPrefixForFirst.length; i++) {
			current += nums[i];
			if (i < firstLen - 1) {
				maxPrefixForFirst[i] = -1;

			} else if (i == firstLen - 1) {
				maxPrefixForFirst[i] = current;
			} else {
				current -= nums[i - firstLen];
				maxPrefixForFirst[i] = Math.max(current, maxPrefixForFirst[i - 1]);
			}
		}

		int[] maxSuffixForSecond = new int[nums.length];
		current = 0;
		for (int i = maxSuffixForSecond.length - 1; i >= 0; i--) {
			current += nums[i];
			if (i > maxSuffixForSecond.length - secondLen) {
				maxSuffixForSecond[i] = -1;

			} else if (i == maxSuffixForSecond.length - secondLen) {
				maxSuffixForSecond[i] = current;
			} else {
				current -= nums[i + secondLen];
				maxSuffixForSecond[i] = Math.max(current, maxSuffixForSecond[i + 1]);
			}
		}

		int maxSum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			maxSum = Math.max(maxSum, (maxPrefixForFirst[i] + maxSuffixForSecond[i + 1]));
		}

		return maxSum;
	}
}
