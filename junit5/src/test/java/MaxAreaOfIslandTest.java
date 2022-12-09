import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxAreaOfIslandTest {
	@Test
	public void two_islands() {

		int[][] grid = new int[][] { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 } };
		Assertions.assertThat(new MaxAreaOfIsland().maxAreaOfIsland(grid)).isEqualTo(4);

	}
}
