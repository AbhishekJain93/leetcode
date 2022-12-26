import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RemoveLeaves366 {
	public List<List<Integer>> findLeaves(TreeNode root) {

		Map<Integer, List<Integer>> map = new TreeMap<>();
		findLeavesHelper(root, map);

		return map.entrySet().stream().map(e -> e.getValue()).toList();
	}

	private int findLeavesHelper(TreeNode root, Map<Integer, List<Integer>> map) {
		if (root == null)
			return 0;

		int height = 1 + Math.max(findLeavesHelper(root.left, map), findLeavesHelper(root.right, map));
		map.putIfAbsent(height, new ArrayList<>());
		map.get(height).add(root.val);
		return height;
	}
}
