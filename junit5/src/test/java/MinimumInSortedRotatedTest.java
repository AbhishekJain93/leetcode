import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInSortedRotatedTest {
	@Test
	public void rotated_two_times() {
		Assertions.assertThat(new MinimumInSortedRotated().findMin(new int[] { 3, 4, 5, 1, 2 })).isEqualTo(1);
	}
}
