public class MaxConsecutiveOnesII {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int lastPos = -1;
		int current = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				current = i - lastPos;
				lastPos = i;
			} else {
				current++;
			}
			max = Math.max(max, current);
		}

		return max;
	}
}
