import java.util.Stack;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;

		Stack<Integer> stack = new Stack<>();

		ListNode p = head, q = head;
		while (p != null) {
			stack.push(p.val);
			p = p.next;
		}

		while (q != null) {
			if (q.val != stack.pop())
				return false;
			q = q.next;
		}

		return true;
	}
}
