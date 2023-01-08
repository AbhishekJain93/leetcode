import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumber1228Test {
	@Test
	public void reverse_ap() {
		Assertions.assertThat(new MissingNumber1228().missingNumber(
				new int[] { 15, 13, 12 })).isEqualTo(14);
	}
}
