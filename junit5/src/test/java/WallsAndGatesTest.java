import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WallsAndGatesTest {

	@Test
	public void happy_case() {

		int[][] maze = new int[][] {
				{ 2147483647, -1, 0, 2147483647 },
				{ 2147483647, 2147483647, 2147483647, -1 },
				{ 2147483647, -1, 2147483647, -1 },
				{ 0, -1, 2147483647, 2147483647 }
		};

		new WallsAndGates().wallsAndGates(maze);

		Assertions.assertThat(maze).isDeepEqualTo(
				new int[][] {
						{ 3, -1, 0, 1 },
						{ 2, 2, 1, -1 },
						{ 1, -1, 2, -1 },
						{ 0, -1, 3, 4 },
				});
	}
}
