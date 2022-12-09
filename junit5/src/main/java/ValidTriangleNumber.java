import java.util.Arrays;

public class ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);

		int total = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			int j = i - 1, k = 0;
			while (k < j) {
				if (nums[j] + nums[k] > nums[i]) {
					total += j - k;
					j--;
				} else {
					k++;
				}
			}

		}

		return total;
	}
}
