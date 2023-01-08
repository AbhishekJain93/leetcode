import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumRoundsTest {

	@Test
	public void four_identical() {
		Assertions.assertThat(new MinimumRounds().minimumRounds(
				new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 })).isEqualTo(4);

	}
}
