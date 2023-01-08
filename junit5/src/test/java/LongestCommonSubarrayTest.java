import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubarrayTest {

	@Test
	public void three_length() {
		Assertions.assertThat(new LongestCommonSubarray().findLength(
				new int[] { 1, 2, 3, 2, 1 },
				new int[] { 3, 2, 1, 4, 7 })).isEqualTo(3);
	}
}
