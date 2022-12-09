import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromNumberTest {
	@Test
	public void negative_number_fails() {
		Assertions.assertThat(new PalindromeNumber().isPalindrome(-121)).isEqualTo(false);
	}

	@Test
	public void palindrome_number() {
		Assertions.assertThat(new PalindromeNumber().isPalindrome(12221)).isEqualTo(true);
	}
}
