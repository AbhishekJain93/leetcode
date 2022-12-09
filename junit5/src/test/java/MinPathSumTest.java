import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinPathSumTest {

	@Test
	public void three_by_three() {
		Assertions.assertThat(new MinPathSum().minPathSum(
				new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } })).isEqualTo(7);
	}
}
