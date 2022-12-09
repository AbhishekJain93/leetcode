import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

	@Test
	public void include_90_and_4() {

		Assertions.assertThat(new RomanToInt().romanToInt("MCMXCIV")).isEqualTo(1994);
	}
}
