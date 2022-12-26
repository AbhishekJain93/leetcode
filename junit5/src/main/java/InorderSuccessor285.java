import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InorderSuccessor285 {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode n) {
		Deque<TreeNode> stack = new ArrayDeque<>();

		TreeNode p = root;
		while (p != null) {
			stack.push(p);
			p = p.left;
		}

		while (true) {
			TreeNode top = stack.pop();
			if (top == n)
				break;

			p = top.right;
			while (p != null) {
				stack.push(p);
				p = p.left;
			}

		}

		p = n.right;
		while (p != null) {
			stack.push(p);
			p = p.left;
		}

		return stack.isEmpty() ? null : stack.peek();
	}

	public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
		if (root == null)
			return null;

		if (root.val <= p.val) {
			return inorderSuccessor2(root.right, p);
		} else {
			TreeNode left = inorderSuccessor2(root.left, p);
			return (left != null) ? left : root;
		}
	}

	public static void main(String[] args) {
		System.out.println(new InorderSuccessor285().kthSmallest(
				new int[] { 7, 4, 5, 1, 2, 9 }, 3));
	}

	public int kthSmallest(int[] nums, int k) {

		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int idx = partition(nums, k, l, r);
			if (idx + 1 == k)
				return nums[idx];

			else if (idx + 1 < k)
				l = idx + 1;

			else
				r = idx - 1;
		}
		return -1;
	}

	private int partition(int[] nums, int k, int l, int r) {
		int mid = l + (r - l) / 2;
		int temp = nums[r];
		nums[r] = nums[mid];
		nums[mid] = temp;

		int pos = l, i = l;

		while (i < r) {
			if (nums[i] < nums[r]) {
				int temp2 = nums[pos];
				nums[pos] = nums[i];
				nums[i] = temp2;
				pos++;
			}
			i++;
		}

		temp = nums[pos];
		nums[pos] = nums[r];
		nums[r] = temp;

		return pos;
	}

}
