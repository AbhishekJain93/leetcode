import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
	public List<List<Integer>> verticalOrder(TreeNode root) {
		Map<Integer, List<Integer>> map = new TreeMap<>();
		Queue<TreeNode> q = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		q.offer(root);
		q2.offer(0);

		while (!q.isEmpty()) {
			TreeNode t = q.poll();
			int offset = q2.poll();
			if (!map.containsKey(offset))
				map.put(offset, new ArrayList<>());

			map.get(offset).add(t.val);
			if (t.left != null) {
				q.offer(t.left);
				q2.offer(offset - 1);
			}
			if (t.right != null) {
				q.offer(t.right);
				q2.offer(offset + 1);
			}
		}

		return map.entrySet().stream().map(e -> e.getValue()).toList();
	}

	// public void verticalOrderHelper(TreeNode root, Map<Integer, List<Integer>>
	// map, int offset) {
	// if (root == null)
	// return;

	// if (!map.containsKey(offset))
	// map.put(offset, new ArrayList<>());

	// map.get(offset).add(root.val);
	// verticalOrderHelper(root.left, map, offset - 1);
	// verticalOrderHelper(root.right, map, offset + 1);
	// }
}
