public class RemoveNthFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head, slow = head;
		ListNode prev = new ListNode(-1, head);
		ListNode preHead = prev;

		for (int i = 1; i < n; i++) {
			if (p == null)
				return null;
			p = p.next;
		}

		while (p != null && p.next != null) {
			p = p.next;
			slow = slow.next;
			prev = prev.next;
		}

		prev.next = prev.next.next;
		return preHead.next;
	}
}

class ListNode {
	ListNode next;
	int val;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
