
class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode fast = head, slow = head;

		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
				slow = slow.next;

				if (fast == slow)
					return true;
			}
		}

		return false;
	}
}