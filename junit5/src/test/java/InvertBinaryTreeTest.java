
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

	@Test
	public void invert_tree_single_node() {
		TreeNode node = new TreeNode(5);
		Assertions.assertThat(new InvertBinaryTree().invertTree(node)).isEqualTo(node);
	}

	@Test
	public void invert_tree_two_level_tree() {
		TreeNode root = new TreeNode(5);
		TreeNode left = new TreeNode(6);
		TreeNode right = new TreeNode(7);
		root.left = left;
		root.right = right;

		TreeNode inverted = root;
		inverted.left = right;
		inverted.right = left;

		Assertions.assertThat(new InvertBinaryTree().invertTree(root)).isEqualTo(inverted);
	}
}
