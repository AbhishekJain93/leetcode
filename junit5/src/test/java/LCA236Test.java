import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LCA236Test {

    @Test
    public void three_node() {
        TreeNode l = new TreeNode(4);
        TreeNode r = new TreeNode(5);
        TreeNode root = new TreeNode(3, l, r);
        Assertions.assertEquals(new LCA236().lowestCommonAncestor(root, l, r), root);

    }
}
