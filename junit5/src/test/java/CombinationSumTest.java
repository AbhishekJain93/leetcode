import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumTest {

	@Test
	public void unsorted_input_array() {
		List<List<Integer>> res = new CombinationSum39().combinationSum(new int[] { 2, 3, 6, 7 }, 7);

		Assertions.assertThat(res.size()).isEqualTo(2);
	}
}
