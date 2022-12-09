import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTIteratorTest {

	@Test
	public void three_node_bst_next() {
		TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		BSTIterator iter = new BSTIterator(root);
		Assertions.assertThat(iter.next()).isEqualTo(1);
		Assertions.assertThat(iter.next()).isEqualTo(2);
		Assertions.assertThat(iter.next()).isEqualTo(3);
		Assertions.assertThat(iter.hasNext()).isEqualTo(false);

	}
}
