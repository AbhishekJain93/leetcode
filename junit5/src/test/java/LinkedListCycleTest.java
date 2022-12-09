import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

	@Test
	public void cycle_exists() {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(-4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;

		Assertions.assertThat(new LinkedListCycle().hasCycle(n1)).isEqualTo(true);
	}
}
