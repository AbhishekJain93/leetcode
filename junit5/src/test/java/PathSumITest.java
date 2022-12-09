import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumITest {

	@Test
	public void height_two_tree_exists() {

		TreeNode root = new TreeNode(5, null, new TreeNode(3));
		Assertions.assertThat(new PathSumI().hasPathSum(root, 8)).isEqualTo(true);

	}
}
