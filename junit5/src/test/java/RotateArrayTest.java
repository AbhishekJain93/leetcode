import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

	@Test
	public void k_equal_three() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		new RotateArray().rotate(nums, 3);

		Assertions.assertThat(Arrays.equals(nums, new int[] { 5, 6, 7, 1, 2, 3, 4 })).isTrue();
	}
}
