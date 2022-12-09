import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {

	@Test
	public void decimal_number() {
		Assertions.assertThat(new Power().myPow(1.2, 4)).isEqualTo(2.0736);
	}

	@Test
	public void power_of_two() {
		Assertions.assertThat(new Power().myPow(2.0000, 10)).isEqualTo(1024.0);
	}

	@Test
	public void cube() {
		Assertions.assertThat(new Power().myPow(2.1, 3)).isEqualTo(9.261000000000001);
	}

	@Test
	public void negative_power() {
		Assertions.assertThat(new Power().myPow(2.00000, -2)).isEqualTo(0.25);

	}

	@Test
	public void power_of_one() {
		Assertions.assertThat(new Power().myPow(1.00000, -222222)).isEqualTo(1);

	}
}
