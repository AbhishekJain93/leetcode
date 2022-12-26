import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPairSumTest {

	@Test
	public void happy_case() {

		Assertions.assertThat(new ArrayPairSum().arrayPairSum(
				new int[] { 6, 2, 6, 5, 1, 2 })).isEqualTo(9);
	}
}
