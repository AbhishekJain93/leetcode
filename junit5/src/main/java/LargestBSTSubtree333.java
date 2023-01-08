public class LargestBSTSubtree333 {
	public int largestBSTSubtree(TreeNode root) {
		if (root == null)
			return 0;
		int val[] = largestBSTSubtreeHelper(root);

		return Math.abs(val[0]);
	}

	private int[] largestBSTSubtreeHelper(TreeNode root) {

		if (root.left == null && root.right == null)
			return new int[] { 1, root.val, root.val };

		int[] leftSub = null, rightSub = null;

		if (root.left != null) {
			leftSub = largestBSTSubtreeHelper(root.left);
		}

		if (root.right != null) {
			rightSub = largestBSTSubtreeHelper(root.right);
		}

		if (leftSub == null) {
			if (rightSub[0] < 0)
				return rightSub;
			else if (root.val < rightSub[1])
				return new int[] { 1 + rightSub[0], root.val, rightSub[2] };
			else
				return new int[] { -1 * rightSub[0], -1, -1 };
		}

		else if (rightSub == null) {
			if (leftSub[0] < 0)
				return leftSub;
			else if (root.val > leftSub[2])
				return new int[] { 1 + leftSub[0], leftSub[1], root.val };
			else
				return new int[] { -1 * leftSub[0], -1, -1 };
		}

		if (leftSub[0] < 0 || rightSub[0] < 0)
			return new int[] { -1 * Math.max(Math.abs(leftSub[0]), Math.abs(rightSub[0])), -1, -1 };

		else if (root.val > leftSub[2] && root.val < rightSub[1])
			return new int[] { 1 + leftSub[0] + rightSub[0], leftSub[1], rightSub[2] };

		else
			return new int[] { -1 * Math.max(leftSub[0], rightSub[0]), -1, -1 };
	}
}
