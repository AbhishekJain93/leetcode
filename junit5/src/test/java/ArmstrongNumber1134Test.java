import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArmstrongNumber1134Test {
	@Test
	public void number_is_armstrong() {
		Assertions.assertThat(new ArmstrongNumber1134().isArmstrong(153)).isEqualTo(true);
	}
}