public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
		ListNode preHead = new ListNode(-1, head);

		preHead.next = swapPairsHelper(preHead.next);
		return preHead.next;
	}

	private ListNode swapPairsHelper(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;

		ListNode swapped = swapPairsHelper(head.next.next);
		ListNode newHead = head.next;
		head.next = swapped;
		newHead.next = head;
		return newHead;
	}
}
