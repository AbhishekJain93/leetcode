import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHalvesAlikeTest {

	@Test
	public void upper_case_and_lower_case_vowels() {
		Assertions.assertThat(new StringHalvesAlike().halvesAreAlike("weaAuBooOO")).isEqualTo(true);

	}
}
