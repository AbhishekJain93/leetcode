import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecoverTree1261Test {

    @Test
    public void unbalanced_tree() {

        TreeNode root = new TreeNode(-1, null, new TreeNode());
        RecoverTree1261 obj = new RecoverTree1261(root);

        Assertions.assertEquals(obj.find(0), true);
        Assertions.assertEquals(obj.find(2), true);
    }
}

class TreeNode {
    int val = -1;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}