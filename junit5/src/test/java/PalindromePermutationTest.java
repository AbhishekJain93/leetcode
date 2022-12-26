import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {

	@Test
	public void valid_palindrome() {

		Assertions.assertThat(new PalindromePermutation().canPermutePalindrome("carerac")).isEqualTo(true);
	}
}
