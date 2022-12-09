import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindrome2LetterTest {

	@Test
	public void singleWordPalindrome() {

		Assertions.assertThat(new LongestPalindrome2Letter().longestPalindrome(new String[] { "bb" })).isEqualTo(2);
	}
}
