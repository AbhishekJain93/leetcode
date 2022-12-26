import java.util.Arrays;

public class ThreeSumSmaller259 {
	public int threeSumSmaller(int[] nums, int target) {
		Arrays.sort(nums);

		int total = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			int val = target - nums[i];
			int j = 0, k = i - 1;
			while (j < k) {
				if (nums[j] + nums[k] < val) {
					total += k - j;
					j++;

				} else {
					k--;
				}
			}
		}

		return total;
	}
}
