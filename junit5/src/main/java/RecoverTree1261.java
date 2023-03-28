import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RecoverTree1261 {

    Set<Integer> set = new HashSet<>();

    public RecoverTree1261(TreeNode root) {
        TreeNode p = root;
        p.val = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            set.add(pop.val);

            if (pop.right != null) {
                pop.right.val = 2 * pop.val + 2;
                stack.push(pop.right);
            }
            if (pop.left != null) {
                pop.left.val = 2 * pop.val + 1;
                stack.push(pop.left);
            }
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}
