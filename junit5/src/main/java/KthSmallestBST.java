import java.util.Stack;

public class KthSmallestBST {

	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}

		TreeNode pop = null;
		while (k > 0) {
			pop = stack.pop();
			k--;
			TreeNode push = pop.right;
			while (push != null) {
				stack.push(push);
				push = push.left;
			}
		}

		return pop.val;
	}

}
