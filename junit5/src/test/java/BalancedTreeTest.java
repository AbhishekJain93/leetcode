import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedTreeTest {

	@Test
	public void single_node_balanced() {
		TreeNode root = new TreeNode(5);

		Assertions.assertThat(new BalancedTree().isBalanced(root)).isEqualTo(true);
	}

}
