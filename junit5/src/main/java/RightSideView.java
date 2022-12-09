import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

	public List<Integer> rightSideView(TreeNode node) {
		List<Integer> result = new ArrayList<>();
		if (node == null)
			return result;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(node);

		while (!q.isEmpty()) {
			List<TreeNode> list = new ArrayList<>();
			while (!q.isEmpty())
				list.add(q.poll());

			result.add(list.get(list.size() - 1).val);

			for (TreeNode treeNode : list) {
				if (treeNode.left != null)
					q.offer(treeNode.left);

				if (treeNode.right != null)
					q.offer(treeNode.right);
			}
		}

		return result;
	}
}
