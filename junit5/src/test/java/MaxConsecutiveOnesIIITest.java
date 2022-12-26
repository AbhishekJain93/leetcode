import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {

	@Test
	public void max_at_last() {

		Assertions.assertThat(new MaxConsecutiveOnesIII().longestOnes(
				new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 2)).isEqualTo(6);
	}
}
