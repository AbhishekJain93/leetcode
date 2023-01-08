import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingElements1426Test {

	@Test
	public void repeated_numbers() {
		Assertions.assertThat(new CountingElements1426().countElements(
				new int[] { 1, 2, 3 })).isEqualTo(2);
	}
}
