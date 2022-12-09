public class SortLinkedList {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode premid = null;
		ListNode end = head, mid = head;

		while (end != null && end.next != null) {
			premid = mid;
			end = end.next.next;
			mid = mid.next;

		}

		premid.next = null;

		ListNode sorted1 = sortList(head);
		ListNode sorted2 = sortList(mid);

		ListNode p = sorted1, q = sorted2;

		ListNode finalSorted = new ListNode(-1), r = finalSorted;
		while (p != null && q != null) {
			if (p.val < q.val) {
				r.next = p;
				p = p.next;
			} else {
				r.next = q;
				q = q.next;
			}

			r = r.next;
		}

		if (p != null) {
			r.next = p;
		}

		if (q != null) {
			r.next = q;
		}

		return finalSorted.next;
	}
}
