import java.util.PriorityQueue;

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> heap = new PriorityQueue<>((ListNode a, ListNode b) -> Integer.compare(a.val, b.val));

		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null)
				heap.offer(lists[i]);
		}

		ListNode prehead = new ListNode(-1);
		ListNode p = prehead;

		while (!heap.isEmpty()) {
			ListNode pop = heap.poll();
			p.next = pop;
			p = p.next;
			if (pop.next != null) {
				heap.offer(pop.next);
			}
		}

		return prehead.next;
	}
}
