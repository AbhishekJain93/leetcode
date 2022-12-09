import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedSquaresTest {

	@Test
	public void negatives_and_positive_numbers() {
		Assertions.assertThat(new SortedSquares().sortedSquares(new int[] { -3, -1, 0, 1, 3 }))
				.isEqualTo(new int[] { 0, 1, 1, 9, 9 });

	}
}
