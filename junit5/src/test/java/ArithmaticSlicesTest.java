import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmaticSlicesTest {

	@Test
	public void all_continuous() {

		Assertions.assertThat(new ArithmaticSlices413().numberOfArithmeticSlices(new int[] { 1, 2, 3, 4 }))
				.isEqualTo(3);
	}
}
