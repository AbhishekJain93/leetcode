import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerticalOrderTest {

	@Test
	public void muliple_child_at_same_position() {

		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		Assertions.assertThat(new VerticalOrder().verticalOrder(root)).isEqualTo(
				List.of(List.of(9), List.of(3, 15), List.of(20), List.of(7)));

	}
}
