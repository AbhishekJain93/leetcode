
public class DiammeterOfTree543 {

	public int diameterOfBinaryTree(TreeNode root) {

		if (root == null)
			return 0;
		int diameterL = diameterOfBinaryTree(root.left);
		int diameterR = diameterOfBinaryTree(root.right);

		return Math.max(diameterL, Math.max(diameterR, height(root.left) + height(root.right)));
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;

		return 1 + Math.max(height(root.left), height(root.right));
	}
}
