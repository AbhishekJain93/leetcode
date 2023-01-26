public class CheckSortedAndRotated1752 {
	public boolean check(int[] nums) {
		int inflections = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1])
				inflections++;
		}

		if (inflections == 0)
			return true;
		if (inflections > 1)
			return false;

		return nums[0] >= nums[nums.length - 1];
	}
}
