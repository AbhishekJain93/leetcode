import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistinctSubstringsCount1180Test {

	@Test
	public void three_distinct_letters() {
		Assertions.assertThat(new DistinctSubstringsCount1180().countLetters("aaaba")).isEqualTo(8);
	}
}
