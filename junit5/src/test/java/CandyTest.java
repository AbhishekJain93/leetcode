import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

	@Test
	public void candy_happy_case() {
		Assertions.assertThat(new Candy135().candy(
				new int[] { 12, 4, 3, 11, 34, 34, 1, 67 })).isEqualTo(16);
	}

	@Test
	public void update_from_reverse_loop() {
		Assertions.assertThat(new Candy135().candy(
				new int[] { 1, 3, 4, 5, 2 })).isEqualTo(11);
	}

	@Test
	public void update_from_reverse_loop_2() {
		Assertions.assertThat(new Candy135().candy(
				new int[] { 1, 0, 2 })).isEqualTo(5);
	}
}
