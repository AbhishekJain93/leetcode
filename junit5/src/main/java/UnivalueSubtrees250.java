public class UnivalueSubtrees250 {
	public int countUnivalSubtrees(TreeNode root) {
		if (root == null)
			return 0;
		int[] res = countUnivalSubtreesHelper(root);
		return res[1];
	}

	private int[] countUnivalSubtreesHelper(TreeNode root) {
		if (root.left == null && root.right == null)
			return new int[] { root.val, 1 };

		int[] leftRes = null, rightRes = null;

		if (root.left != null)
			leftRes = countUnivalSubtreesHelper(root.left);

		if (root.right != null)
			rightRes = countUnivalSubtreesHelper(root.right);

		if (leftRes == null && (rightRes[0] == Integer.MIN_VALUE || rightRes[0] != root.val)) {
			return new int[] { Integer.MIN_VALUE, rightRes[1] };
		}

		else if (leftRes == null) {
			return new int[] { root.val, 1 + rightRes[1] };
		}

		else if (rightRes == null && (leftRes[0] == Integer.MIN_VALUE || leftRes[0] != root.val)) {
			return new int[] { Integer.MIN_VALUE, leftRes[1] };
		}

		else if (rightRes == null) {
			return new int[] { root.val, 1 + leftRes[1] };
		}

		else if (leftRes[0] == Integer.MIN_VALUE || rightRes[0] == Integer.MIN_VALUE || leftRes[0] != rightRes[0]
				|| leftRes[0] != root.val)
			return new int[] { Integer.MIN_VALUE, leftRes[1] + rightRes[1] };

		else
			return new int[] { root.val, 1 + leftRes[1] + rightRes[1] };
	}
}
