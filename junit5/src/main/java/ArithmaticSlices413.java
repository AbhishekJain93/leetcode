public class ArithmaticSlices413 {
	public int numberOfArithmeticSlices(int[] nums) {

		int total = 0, currentLen = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
				currentLen++;
				continue;
			} else {
				if (currentLen > 2) {
					total += (currentLen - 2) * (currentLen - 1) / 2;
				}

				currentLen = 2;
			}
		}
		if (currentLen > 2) {
			total += (currentLen - 2) * (currentLen - 1) / 2;
		}

		return total;
	}
}
