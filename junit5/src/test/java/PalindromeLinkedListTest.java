import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

	@Test
	public void list_single_element() {

		Assertions.assertThat(new PalindromeLinkedList().isPalindrome(new ListNode(5))).isEqualTo(true);

	}
}
