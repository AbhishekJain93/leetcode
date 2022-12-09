import java.util.Comparator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {

	@Test
	public void four_element_list() {
		Comparator<ListNode> comp = (ListNode n1, ListNode n2) -> Integer.compare(n1.val, n2.val);
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		ListNode result = new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(4))));

		Assertions.assertThat(new OddEvenLinkedList().oddEvenList(head)).usingComparator(comp).isEqualTo(result);
	}
}
