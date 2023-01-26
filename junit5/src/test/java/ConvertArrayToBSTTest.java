import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertArrayToBSTTest {
	@Test
	public void three_node() {
		Assertions.assertThat(new ConvertArrayToBST108().sortedArrayToBST(new int[] { 1, 2, 3 }))
				.usingComparator((TreeNode n1, TreeNode n2) -> n1.val - n2.val)
				.isEqualTo(new TreeNode(2, new TreeNode(1), new TreeNode(3)));
	}
}
