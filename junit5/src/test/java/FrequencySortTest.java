import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrequencySortTest {

	@Test
	public void frequency_sort() {

		Assertions.assertThat(new FrequencySort().frequencySort("cabccdfd")).isEqualTo("cccddbaf");
	}
}
