import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIITest {

	@Test
	public void happy_case() {
		Assertions.assertThat(new MaxConsecutiveOnesII().findMaxConsecutiveOnes(
				new int[] { 1, 0, 1, 1, 0 })).isEqualTo(4);
	}
}
