import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {

	@Test
	public void four_nodes_list() {
		ListNode n = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode n2 = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))));

		Assertions.assertThat(new SwapNodesInPairs().swapPairs(n))
				.usingComparator((ListNode na, ListNode nb) -> Integer.compare(na.val, nb.val)).isEqualTo(n2);
	}
}