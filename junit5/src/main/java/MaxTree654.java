public class MaxTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return treeHelper(nums, 0, nums.length - 1);

    }

    private TreeNode treeHelper(int[] nums, int lo, int hi) {
        if (hi < lo)
            return null;

        if (lo == hi) {
            return new TreeNode(nums[lo]);
        }

        int maxIdx = lo;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        return new TreeNode(nums[maxIdx], treeHelper(nums, lo, maxIdx - 1), treeHelper(nums, maxIdx + 1, hi));
    }
}
