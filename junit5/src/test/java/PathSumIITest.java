import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumIITest {

	@Test
	public void three_node_tree_two_paths() {
		TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
				new TreeNode(8));
		Assertions.assertThat(new PathSumII().pathSum(root, 22))
				.isEqualTo(new ArrayList<List<Integer>>(List.of(List.of(5, 4, 11, 2))));
	}
}
