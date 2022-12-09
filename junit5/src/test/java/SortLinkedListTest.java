import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortLinkedListTest {

	@Test
	public void five_node_list() {

		ListNode n = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
		ListNode sorted = new SortLinkedList().sortList(n);

		Assertions.assertThat(sorted.val).isEqualTo(-1);
		Assertions.assertThat(sorted.next.val).isEqualTo(0);
		Assertions.assertThat(sorted.next.next.val).isEqualTo(3);
		Assertions.assertThat(sorted.next.next.next.val).isEqualTo(4);
		Assertions.assertThat(sorted.next.next.next.next.val).isEqualTo(5);
	}
}
