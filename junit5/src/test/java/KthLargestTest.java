import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

	@Test
	public void k_equals_2() {
		Assertions.assertThat(new KthLargest().findKthLargest2(
				new int[] { 3, 2, 1, 5, 6, 4 }, 2)).isEqualTo(5);
	}
}
