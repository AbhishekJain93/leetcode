import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class levelorder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue queue = new LinkedList<>();
        queue.add(Arrays.asList(root));

        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<TreeNode> nodes = (List<TreeNode>) queue.remove();
            List<Integer> level = nodes
                    .stream()
                    .filter(x -> x != null)
                    .map(n -> n.val)
                    .collect(Collectors.toList());

            if (!level.isEmpty())
                result.add(level);

            List<TreeNode> nextLevel = nodes
                    .stream()
                    .filter(x -> x != null)
                    .flatMap(n -> Stream.of(n.left, n.right))
                    .filter(n -> n != null)
                    .collect(Collectors.toList());

            if (!nextLevel.isEmpty())
                queue.add(nextLevel);
        }

        return result;
    }
}

class TreeNode {
    int val;
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
