import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

	@Test
	public void two_zeroes() {
		int[] arr = new int[] { 0, 2, 0, 1, 0 };
		new MoveZeroes().moveZeroes(arr);
		Assertions.assertThat(arr)
				.isEqualTo(new int[] { 2, 1, 0, 0, 0 });
	}

	@Test
	public void five_elements() {
		int[] arr = new int[] { 0, 1, 0, 3, 12 };
		new MoveZeroes().moveZeroes(arr);
		Assertions.assertThat(arr)
				.isEqualTo(new int[] { 1, 3, 12, 0, 0 });
	}
}
