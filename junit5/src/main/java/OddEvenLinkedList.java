
public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;

		ListNode oddStart = head, oddCurrent = head;
		ListNode evenStart = head.next, evenCurrent = head.next;

		while (evenCurrent != null && evenCurrent.next != null) {
			oddCurrent.next = evenCurrent.next;
			oddCurrent = oddCurrent.next;
			evenCurrent.next = oddCurrent.next;
			evenCurrent = evenCurrent.next;
		}

		oddCurrent.next = evenStart;
		return oddStart;
	}
}
