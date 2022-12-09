import java.util.Arrays;

// -1, 2, 1, -4 
public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);

		int closest = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int currentSum = nums[i] + nums[j] + nums[k];
				if (Math.abs(currentSum - target) < Math.abs(closest - target)) {
					closest = currentSum;
				}
				if (currentSum == target) {
					return currentSum;
				} else if (currentSum < target) {
					j++;
				} else {
					k--;
				}
			}
		}

		return closest;
	}
}
