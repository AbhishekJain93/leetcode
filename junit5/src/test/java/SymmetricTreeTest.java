import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

	@Test
	public void three_node_symmetric_tree() {
		TreeNode n1 = new TreeNode(5, new TreeNode(4), new TreeNode(4));
		Assertions.assertThat(new SymmetricTree().isSymmetric(n1)).isEqualTo(true);
	}
}
