import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UnivalueSubtrees250Test {

	@Test
	public void four_subtrees() {

		TreeNode root = new TreeNode(5, new TreeNode(1, new TreeNode(5), new TreeNode(5)),
				new TreeNode(5, null, new TreeNode(5)));

		Assertions.assertThat(new UnivalueSubtrees250().countUnivalSubtrees(root)).isEqualTo(4);
	}

}