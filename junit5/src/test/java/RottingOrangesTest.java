import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {

	@Test
	public void two_by_two_two_mins() {
		Assertions.assertThat(new RottingOranges().orangesRotting(new int[][] { { 1, 1 }, { 1, 2 } })).isEqualTo(2);
	}

	@Test
	public void single_row_two_rotten() {
		Assertions.assertThat(new RottingOranges().orangesRotting(new int[][] { { 0, 2, 2 } })).isEqualTo(0);
	}
}