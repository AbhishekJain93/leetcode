import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiammeterOfTreeTest {

	@Test
	public void two_node_tree() {
		TreeNode root = new TreeNode(1, new TreeNode(2), null);
		Assertions.assertThat(new DiammeterOfTree543().diameterOfBinaryTree(root)).isEqualTo(1);
	}
}
