import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoCitySchedulingTest {

	@Test
	public void everyone_wants_to_go_city_A() {
		Assertions.assertThat(
				new TwoCityScheduling().twoCitySchedCost(new int[][] { { 1, 10 }, { 2, 20 }, { 10, 20 }, { 20, 50 } }))
				.isEqualTo(52);
	}
}
