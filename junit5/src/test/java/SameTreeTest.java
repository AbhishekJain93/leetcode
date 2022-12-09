import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

	@Test
	public void three_node_same_tree() {

		TreeNode root1 = new TreeNode(5, new TreeNode(4), new TreeNode(6));
		TreeNode root2 = new TreeNode(5, new TreeNode(4), new TreeNode(6));
		Assertions.assertThat(new SameTree().isSameTree(root1, root2)).isEqualTo(true);
	}
}
