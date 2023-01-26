import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClosestBinarySearchTreeTest {

	@Test
	public void root_is_closest() {

		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(5));
		Assertions.assertThat(new ClosestBinarySearchTree270().closestValue(root, 3.714286)).isEqualTo(4);
	}
}
