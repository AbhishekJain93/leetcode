import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveSubarrayForSorted1574Test {

	@Test
	public void subarray_in_middle() {
		Assertions.assertThat(new RemoveSubarrayForSorted1574().findLengthOfShortestSubarray(
				new int[] { 1, 2, 3, 10, 4, 2, 3, 5 })).isEqualTo(3);
	}

	@Test
	public void subarray_in_middle_2() {
		Assertions.assertThat(new RemoveSubarrayForSorted1574().findLengthOfShortestSubarray(
				new int[] { 10, 13, 17, 21, 15, 15, 9, 17, 22, 22, 13 })).isEqualTo(7);
	}
}
