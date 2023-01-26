import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumKnightsMoveTest {

	@Test
	public void five_five() {
		Assertions.assertThat(new MinimumKnightsMove1197().minKnightMoves(2, 112)).isEqualTo(4);
	}

}
