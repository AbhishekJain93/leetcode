import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveLeaves366Test {

	@Test
	public void three_height_tree() {

		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		Assertions.assertThat(new RemoveLeaves366().findLeaves(root)).isEqualTo(
				List.of(List.of(4, 5, 3), List.of(2), List.of(1)));
	}

}