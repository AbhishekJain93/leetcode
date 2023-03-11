import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreePath257Test {

    @Test
    public void two_paths() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        Assertions.assertEquals(new BinaryTreePath257().binaryTreePaths(root), List.of("1->2->5", "1->3"));
    }
}
