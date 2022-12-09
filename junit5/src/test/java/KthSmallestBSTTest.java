import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSmallestBSTTest {

	@Test
	public void second_smallest_three_node_tree() {

		Assertions.assertThat(new KthSmallestBST().kthSmallest(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 2))
				.isEqualTo(2);

	}
}
