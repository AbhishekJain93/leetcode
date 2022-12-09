public class MajorityElement {
	public int majorityElement(int[] nums) {
		int majority = nums[0];
		int count = 1;

		int i = 1;
		while (i < nums.length) {
			if (nums[i] == majority) {
				count++;
				i++;
			}

			else {
				if (--count == 0) {
					majority = nums[i + 1];
					count = 1;
					i += 1;
				}
				i += 1;
			}
		}

		return majority;
	}
}
