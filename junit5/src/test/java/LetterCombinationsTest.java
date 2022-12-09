import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCombinationsTest {

	@Test
	public void two_digits() {
		Assertions.assertThat(new LetterCombinations().letterCombinations("23"))
				.isEqualTo(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
	}

	@Test
	public void single_digits() {
		Assertions.assertThat(new LetterCombinations().letterCombinations("2"))
				.isEqualTo(List.of("a", "b", "c"));
	}

	@Test
	public void no_digits() {
		Assertions.assertThat(new LetterCombinations().letterCombinations(""))
				.isEqualTo(List.of());
	}
}
