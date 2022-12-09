import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumKTest {

	@Test
	public void sum_equals_full_array() {
		Assertions.assertThat(new SubarraySumK().subarraySum(new int[] { 1, 2, 3 }, 6)).isEqualTo(1);

	}
}
