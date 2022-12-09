public class PathSumI {

	public boolean hasPathSum(TreeNode root, int target) {
		if (root == null)
			return false;

		if (root.left == null && root.right == null && root.val == target)
			return true;
		if (root.left == null && root.right == null && root.val != target)
			return false;

		return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);
	}
}
