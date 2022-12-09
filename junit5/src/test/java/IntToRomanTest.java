import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntToRomanTest {

	@Test
	public void contains_90_and_4() {
		Assertions.assertThat(new IntToRoman().intToRoman(1994)).isEqualTo("MCMXCIV");
	}
}
