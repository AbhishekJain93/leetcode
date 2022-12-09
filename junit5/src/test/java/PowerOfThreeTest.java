import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {

	@Test
	public void negative_number() {
		Assertions.assertThat(new PowerOfThree().isPowerOfThree(-27)).isEqualTo(false);
	}
}
