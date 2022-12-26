import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIITest {

	@Test
	public void not_a_palindrom_after_one_deletion() {

		Assertions.assertThat(new ValidPalindromeII().validPalindrome("abbcdbba")).isTrue();
	}
}
