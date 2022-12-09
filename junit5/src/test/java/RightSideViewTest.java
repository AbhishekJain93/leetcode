import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightSideViewTest {

	@Test
	public void left_arm_bigger_tree() {

		TreeNode node = new TreeNode(4, new TreeNode(3, new TreeNode(5), new TreeNode(6)), new TreeNode(2));
		Assertions.assertThat(new RightSideView().rightSideView(node)).isEqualTo(Arrays.asList(4, 2, 6));

	}
}
