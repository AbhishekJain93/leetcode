import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAverageDifferenceTest {

	@Test
	public void six_elements() {
		Assertions.assertThat(new MinimumAverageDifference().minimumAverageDifference(new int[] { 2, 5, 3, 9, 5, 3 }))
				.isEqualTo(3);
	}

}
