public class BalancedTree {

	public boolean isBalanced(TreeNode root) {

		return balancedHeight(root) != -1;
	}

	public int balancedHeight(TreeNode root) {
		if (root == null)
			return 0;

		int leftH = balancedHeight(root.left);
		int rightH = balancedHeight(root.right);

		if (leftH == -1 || rightH == -1)
			return -1;

		if (Math.abs(leftH - rightH) > 1)
			return -1;

		return 1 + Math.max(leftH, rightH);
	}
}
