import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestBSTSubtree333Test {

	@Test
	public void three_size_bst() {
		TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(1), new TreeNode(8)),
				new TreeNode(15, null, new TreeNode(7)));
		Assertions.assertThat(new LargestBSTSubtree333().largestBSTSubtree(root)).isEqualTo(3);
	}
}