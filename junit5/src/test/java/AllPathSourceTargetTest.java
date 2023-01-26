import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllPathSourceTargetTest {

	@Test
	public void two_path() {

		Assertions.assertThat(new AllPathSourceTarget797().allPathsSourceTarget(
				new int[][] {
						{ 1, 2 }, { 3 }, { 3 }, {}
				}

		)).isEqualTo(List.of(List.of(0, 1, 3), List.of(0, 2, 3)));
	}
}
