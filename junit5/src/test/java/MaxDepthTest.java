import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDepthTest {

	@Test
	public void depth_three() {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		Assertions.assertThat(new MaxDepth().maxDepth(root)).isEqualTo(3);
	}
}
