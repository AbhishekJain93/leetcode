import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallFallTest {

	@Test
	void ball_fall_all_stuck() {

		Assertions.assertThat(new BallFall().findBall(new int[][] { { -1, 1, 1, 1, -1 }, { -1, -1, -1, -1, -1 } }))
				.isEqualTo(new int[] { -1, 1, 2, -1, -1 });

	}
}
