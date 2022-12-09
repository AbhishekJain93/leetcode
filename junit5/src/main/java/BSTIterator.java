import java.util.Stack;

public class BSTIterator {

	Stack<TreeNode> stack = new Stack<>();

	public BSTIterator(TreeNode root) {
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	public int next() {
		TreeNode n = stack.pop();
		TreeNode next = n.right;
		while (next != null) {
			stack.push(next);
			next = next.left;
		}

		return n.val;
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}
}
