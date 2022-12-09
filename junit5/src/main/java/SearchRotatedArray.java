public class SearchRotatedArray {
	public int search(int[] nums, int target) {
		return searchHelper(nums, target, 0, nums.length - 1);
	}

	private int searchHelper(int[] nums, int target, int lo, int hi) {
		if (lo > hi)
			return -1;

		if (lo == hi)
			return nums[lo] == target ? lo : -1;

		int mid = lo + (hi - lo) / 2;

		if (nums[mid] == target)
			return mid;

		if (nums[mid] < nums[hi] && target > nums[mid] && target <= nums[hi]) {
			return searchHelper(nums, target, mid + 1, hi);
		}

		if (nums[mid] < nums[hi] && (target < nums[mid] || target > nums[hi])) {
			return searchHelper(nums, target, lo, mid - 1);
		}

		if (nums[mid] > nums[hi] && target > nums[hi] && target < nums[mid]) {
			return searchHelper(nums, target, lo, mid - 1);
		}

		if (nums[mid] > nums[hi] && (target > nums[mid] || target <= nums[hi])) {
			return searchHelper(nums, target, mid + 1, hi);
		}

		return -1;
	}
}
