import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OneEditDistance161Test {

	@Test
	public void one_distance_true() {
		Assertions.assertThat(new OneEditDistance161().isOneEditDistance(
				"abcc",
				"accc")).isEqualTo(true);
	}

	@Test
	public void null_strings_false() {
		Assertions.assertThat(new OneEditDistance161().isOneEditDistance(
				"",
				"")).isEqualTo(false);
	}

	@Test
	public void single_char_true() {
		Assertions.assertThat(new OneEditDistance161().isOneEditDistance(
				"aa",
				"a")).isEqualTo(true);
	}

	@Test
	public void single_char_true_2() {
		Assertions.assertThat(new OneEditDistance161().isOneEditDistance(
				"ba",
				"a")).isEqualTo(true);
	}
}