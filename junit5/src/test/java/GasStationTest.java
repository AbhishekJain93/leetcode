import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {

	@Test
	public void last_idx_is_starting() {
		Assertions
				.assertThat(
						new GasStation().canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }))
				.isEqualTo(3);

	}
}
