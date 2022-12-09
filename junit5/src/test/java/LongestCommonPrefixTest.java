import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

	@Test
	void lcp_same_arrays() {
		Assertions.assertThat(new LongestCommonPrefix().longestCommonPrefix(new String[] { "XXX", "XXXY" }))
				.isEqualTo("XXX");
	}

}
