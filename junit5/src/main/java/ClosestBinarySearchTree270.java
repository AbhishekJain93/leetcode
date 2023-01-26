public class ClosestBinarySearchTree270 {
	public int closestValue(TreeNode root, double target) {
		TreeNode p = root;
		int closest = root.val;

		while (p != null) {
			if (Math.abs(target - closest) > Math.abs(target - p.val)) {
				closest = p.val;
			}
			if (target < p.val)
				p = p.left;

			else
				p = p.right;

		}

		return closest;
	}
}
