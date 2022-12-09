import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSumNonOverlappingSubarrayTest {

	@Test
	public void consecutive_subarrays() {
		Assertions.assertThat(new MaximumSumNonOverlappingSubarray().maxSumTwoNoOverlap(
				new int[] { 3, 8, 1, 3, 2, 1, 8, 9, 0 }, 3, 2)).isEqualTo(29);

	}

	@Test
	public void separated_subarrays() {
		Assertions.assertThat(new MaximumSumNonOverlappingSubarray().maxSumTwoNoOverlap(
				new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8 }, 4, 3)).isEqualTo(31);

	}

	@Test
	public void length_one() {
		Assertions.assertThat(new MaximumSumNonOverlappingSubarray().maxSumTwoNoOverlap(
				new int[] { 0, 6, 5, 2, 2, 5, 1, 9, 4 }, 1, 2)).isEqualTo(20);

	}

	@Test
	public void separated_subarrays_2() {
		Assertions.assertThat(new MaximumSumNonOverlappingSubarray().maxSumTwoNoOverlap(
				new int[] { 4, 5, 14, 16, 16, 20, 7, 13, 8, 15 }, 3, 5)).isEqualTo(109);

	}

	@Test
	public void length_4() {
		Assertions.assertThat(new MaximumSumNonOverlappingSubarray().maxSumTwoNoOverlap(
				new int[] { 8, 20, 6, 2, 20, 17, 6, 3, 20, 8, 12 }, 5, 4)).isEqualTo(108);

	}
}
