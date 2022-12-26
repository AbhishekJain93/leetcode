import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSizeSubarraySumTest {

	@Test
	public void happy_case() {

		Assertions.assertThat(new MaximumSizeSubarraySum().maxSubArrayLen(new int[] { 1, -1, 5, -2, 3 }, 3))
				.isEqualTo(4);

	}
}
