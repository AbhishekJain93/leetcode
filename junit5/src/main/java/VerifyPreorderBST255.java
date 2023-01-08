import java.util.ArrayDeque;
import java.util.Deque;

public class VerifyPreorderBST255 {
	public boolean verifyPreorder(int[] preorder) {

		return verifyHelper(preorder, 0, preorder.length - 1);
	}

	private boolean verifyHelper(int[] preorder, int root, int end) {
		if (end - root <= 1)
			return true;

		int idx = root + 1;
		while (idx <= end && preorder[idx] < preorder[root])
			idx++;

		for (int i = idx; i <= end; i++) {
			if (preorder[i] < preorder[root])
				return false;
		}

		return verifyHelper(preorder, root + 1, idx - 1) && verifyHelper(preorder, idx, end);
	}

	public boolean verifyPreorder2(int[] preorder) { // https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/solutions/68161/72ms-c-solution-using-one-stack-o-n-time-and-space/?orderBy=most_relevant&page=2
		int currentMin = Integer.MIN_VALUE;
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(preorder[0]);
		for (int i = 1; i < preorder.length; i++) {
			if (stack.isEmpty() || preorder[i] < stack.peek()) {
				if (preorder[i] < currentMin)
					return false;
				stack.push(preorder[i]);
			} else {

				while (!stack.isEmpty() && stack.peek() < preorder[i]) {
					currentMin = stack.pop();
				}
				stack.push(preorder[i]);
			}
		}

		return true;
	}
}
