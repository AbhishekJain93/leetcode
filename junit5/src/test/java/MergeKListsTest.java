import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeKListsTest {

	@Test
	public void three_lists() {
		ListNode[] lists = new ListNode[3];
		lists[0] = new ListNode(2, new ListNode(3, new ListNode(8)));
		lists[1] = new ListNode(3, new ListNode(5, new ListNode(7)));
		lists[1] = new ListNode(5, new ListNode(7, new ListNode(9)));
		ListNode merged = new MergeKLists().mergeKLists(lists);
		ListNode expected = new ListNode(2, new ListNode(3,
				new ListNode(3, new ListNode(5, new ListNode(5, new ListNode(7, new ListNode(8, new ListNode(9))))))));

		Assertions.assertThat(merged).usingComparator((ListNode a, ListNode b) -> Integer.compare(a.val, b.val))
				.isEqualTo(expected);
	}
}
