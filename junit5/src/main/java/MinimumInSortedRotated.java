public class MinimumInSortedRotated {
	public int findMin(int[] nums) {
		int lo = 0, hi = nums.length - 1;

		while (lo <= hi) {
			if (lo == hi)
				return nums[lo];

			int mid = lo + (hi - lo) / 2;

			if (nums[mid] < nums[hi]) {
				hi = mid;

			} else {
				lo = mid + 1;
			}
		}

		return -1;
	}
}
