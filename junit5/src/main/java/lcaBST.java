public class lcaBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (true) {
            if (current == null)
                return null;

            if (current == p || current == q)
                return current;

            if (p.val < current.val && q.val > current.val || p.val > current.val && q.val < current.val)
                return current;

            if (p.val < current.val && q.val < current.val) {
                current = current.left;
                continue;
            }
            if (p.val > current.val && q.val > current.val) {
                current = current.right;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8)));

        TreeNode lca = new lcaBST().lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println(lca.val);
    }

}
