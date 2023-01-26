import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestDistanceToTargetColor1182Test {

	@Test
	public void happy_case() {

		Assertions.assertThat(new ShortestDistanceToTargetColor1182().shortestDistanceColor(
				new int[] { 1, 1, 2, 1, 3, 2, 2, 3, 3 },
				new int[][] {
						{ 1, 3 }, { 2, 2 }, { 6, 1 }
				})).isEqualTo(
						List.of(3, 0, 3));
	}

}