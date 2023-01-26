import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetonateMaxBombsTest {

	@Test
	public void overlapping_bombs() {
		int[][] bombs = new int[][] { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 4, 2 }, { 4, 5, 3 }, { 5, 6, 4 } };
		Assertions.assertThat(new DetonateMaxBombs2101().maximumDetonation(bombs)).isEqualTo(5);
	}
}
