public class WiggleSort {
	public void wiggleSort(int[] nums) {
		for (int i = 1; i < nums.length; i += 2) {
			if (nums[i - 1] > nums[i]) {
				int temp = nums[i];
				nums[i] = nums[i - 1];
				nums[i - 1] = temp;
			}
			if (i < nums.length - 1 && nums[i + 1] > nums[i]) {
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}
	}
}
