import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTree654Test {

    @Test
    public void six_nodes() {
        TreeNode tree = new MaxTree654().constructMaximumBinaryTree(new int[] { 3, 2, 1, 6, 0, 5 });
        Assertions.assertEquals(tree.val, 6);
        Assertions.assertEquals(tree.left.val, 3);
        Assertions.assertEquals(tree.right.val, 5);
    }

}
