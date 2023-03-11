import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreePath257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> paths = helper(root);
        List<String> res = new ArrayList<>();

        for (List<Integer> p : paths) {
            if (p.isEmpty())
                continue;

            List<Integer> rev = new ArrayList<>(p.size());
            for (int j = p.size() - 1; j >= 0; j--) {
                rev.add(p.get(j));
            }

            String pathString = rev.stream().map(i -> "" + i).collect(Collectors.joining("->"));
            res.add(pathString);
        }
        return res;
    }

    public List<List<Integer>> helper(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> paths = new ArrayList<>();
        if (root.left == null && root.right == null) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(root.val);
            paths.add(l);
            return paths;
        }

        for (List<Integer> list : helper(root.left)) {
            list.add(root.val);
            paths.add(list);
        }

        for (List<Integer> list : helper(root.right)) {
            list.add(root.val);
            paths.add(list);
        }

        return paths;
    }
}
