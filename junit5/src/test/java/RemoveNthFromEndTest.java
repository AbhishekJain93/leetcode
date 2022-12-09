import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthFromEndTest {

	@Test
	public void singleNode() {
		Assertions.assertThat(new RemoveNthFromEnd().removeNthFromEnd(new ListNode(5), 2)).isEqualTo(null);
	}
}
