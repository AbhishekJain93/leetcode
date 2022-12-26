import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InorderSuccessor285Test {

	@Test
	public void no_right_child() {
		TreeNode root = new TreeNode(2);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(3);
		root.left = n1;
		root.right = n2;

		Assertions.assertThat(new InorderSuccessor285().inorderSuccessor(
				root, n1)).isEqualTo(root);
	}

}