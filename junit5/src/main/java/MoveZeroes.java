public class MoveZeroes {

	// [0,2,0,1,0]
	public void moveZeroes(int[] nums) {
		int l = 0, r = 1;

		while (nums[l] != 0)
			l++;

		for (r = l + 1; r < nums.length; r++) {
			if (nums[r] != 0) {
				nums[l] = nums[r];
				l++;
			}
		}

		while (l < nums.length) {
			nums[l++] = 0;
		}
	}
}
