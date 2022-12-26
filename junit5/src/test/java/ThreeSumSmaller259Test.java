import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeSumSmaller259Test {

	@Test
	public void negative_number() {
		Assertions.assertThat(new ThreeSumSmaller259().threeSumSmaller(new int[] { -2, 0, 1, 3 }, 2)).isEqualTo(2);
	}

}