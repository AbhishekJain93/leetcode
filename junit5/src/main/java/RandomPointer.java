import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RandomPointer {
	public RandomNode copyRandomList(RandomNode head) {
		Map<RandomNode, RandomNode> map = new HashMap<>();

		RandomNode copiedPreHead = new RandomNode(-1);
		RandomNode p1 = head, p2 = copiedPreHead;

		while (p1 != null) {
			RandomNode node1 = new RandomNode(p1.val);
			p2.next = node1;
			map.put(p1, node1);
			p1 = p1.next;
			p2 = p2.next;
		}

		for (Entry<RandomNode, RandomNode> entry : map.entrySet()) {
			RandomNode original = entry.getKey();
			RandomNode copied = entry.getValue();
			copied.random = map.get(original.random);
		}

		return copiedPreHead.next;
	}
}

class RandomNode {
	int val;
	RandomNode next;
	RandomNode random;

	public RandomNode(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}