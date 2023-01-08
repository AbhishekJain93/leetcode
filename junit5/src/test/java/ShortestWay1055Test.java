import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestWay1055Test {

	@Test
	public void three_subStrings() {

		Assertions.assertThat(new ShortestWay1055().shortestWay("xyz", "xzyxz")).isEqualTo(3);
	}

	@Test
	public void two_subStrings() {

		Assertions.assertThat(new ShortestWay1055().shortestWay("abc", "abcbc")).isEqualTo(2);
	}

	@Test
	public void one_subStrings() {
		Assertions.assertThat(new ShortestWay1055().shortestWay("ab", "ab")).isEqualTo(1);
	}

}