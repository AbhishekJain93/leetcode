import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphValidTree261Test {

	@Test
	public void cycle_exists() {
		Assertions.assertThat(new GraphValidTree261().validTree(
				5, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 } })).isEqualTo(false);
	}

	@Test
	public void valid_tree() {
		Assertions.assertThat(new GraphValidTree261().validTree(
				5, new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } })).isEqualTo(true);
	}
}
