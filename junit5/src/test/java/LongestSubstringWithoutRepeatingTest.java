import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {

	@Test
	public void max_substring_len_3() {
		Assertions.assertThat(new LongestSubstringWithoutRepeating().lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
	}
}
