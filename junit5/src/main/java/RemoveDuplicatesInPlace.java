public class RemoveDuplicatesInPlace {
	public int removeDuplicates(int[] nums) {
		int l = 0, r = 0;
		int previous = Integer.MIN_VALUE, k = 0;

		while (r < nums.length) {
			if (nums[r] != previous) {
				previous = nums[r];
				nums[l++] = nums[r++];
				k++;
			} else {
				r++;
			}
		}

		return k;
	}
}
