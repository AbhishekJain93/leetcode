public class ConvertArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
		return bstHelper(nums, 0, nums.length - 1);
	}

	public TreeNode bstHelper(int[] nums, int lo, int hi) {
		if (lo > hi)
			return null;

		int mid = lo + (hi - lo) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = bstHelper(nums, lo, mid - 1);
		root.right = bstHelper(nums, mid + 1, hi);

		return root;
	}
}
