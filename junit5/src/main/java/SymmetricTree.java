
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {

		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode n1, TreeNode n2) {
		if (n1 == null && n2 == null)
			return true;
		else if (n1 == null || n2 == null)
			return false;

		return n1.val == n2.val && isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
	}
}
