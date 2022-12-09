import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public List<List<Integer>> pathSum(TreeNode root, int target) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> currentList = new ArrayList<>();
		pathSumHelper(root, target, result, currentList);
		return result;
	}

	public void pathSumHelper(TreeNode root, int target, List<List<Integer>> result, List<Integer> currentList) {
		if (root == null)
			return;

		if (root.left == null && root.right == null && root.val != target) {
			return;
		}

		currentList.add(root.val);
		if (root.left == null && root.right == null && root.val == target) {
			result.add(new ArrayList<Integer>(currentList));
			currentList.remove(currentList.size() - 1);
			return;
		}

		pathSumHelper(root.left, target - root.val, result, currentList);
		pathSumHelper(root.right, target - root.val, result, currentList);
		currentList.remove(currentList.size() - 1);
		return;
	}
}
