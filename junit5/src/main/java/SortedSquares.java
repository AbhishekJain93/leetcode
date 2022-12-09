public class SortedSquares {

	public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];

		int start = 0, end = nums.length - 1, i = nums.length - 1;
		while (start <= end) {
			if (Math.abs(nums[start]) < Math.abs(nums[end])) {
				result[i] = nums[end] * nums[end];
				end--;
			} else {
				result[i] = nums[start] * nums[start];
				start++;
			}
			i--;
		}

		return result;
	}
}
