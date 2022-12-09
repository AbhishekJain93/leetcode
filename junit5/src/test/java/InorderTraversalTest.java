import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InorderTraversalTest {

	@Test
	public void single_path_tree() {

		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		Assertions.assertThat(new InorderTraversal().inorderTraversal(root)).isEqualTo(List.of(1, 3, 2));
	}
}
