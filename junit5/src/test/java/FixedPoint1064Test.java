import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FixedPoint1064Test {

	@Test
	public void zero_is_fixed_point() {
		Assertions.assertThat(new FixedPoint1064().fixedPoint(
				new int[] { 0, 2, 5, 8, 17 })).isEqualTo(0);
	}

	@Test
	public void two_points_choose_lower_index() {
		Assertions.assertThat(new FixedPoint1064().fixedPoint(
				new int[] { -10, -5, -2, 0, 4, 5, 6, 7, 8, 9, 10 })).isEqualTo(4);
	}

	@Test
	public void no_fixed_point() {
		Assertions.assertThat(new FixedPoint1064().fixedPoint(
				new int[] { -10, -5, 3, 4, 7, 9 })).isEqualTo(-1);
	}
}