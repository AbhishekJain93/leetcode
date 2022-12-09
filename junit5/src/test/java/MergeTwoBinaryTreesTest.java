import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoBinaryTreesTest {

	@Test
	public void complimentary_trees() {

		TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
		TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)),
				new TreeNode(3, null, new TreeNode(7)));
		TreeNode merged = new MergeTwoBinaryTrees().mergeTrees(root1, root2);
		Assertions.assertThat(merged.val).isEqualTo(3);
	}
}
