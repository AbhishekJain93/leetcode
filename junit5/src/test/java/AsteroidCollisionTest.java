import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsteroidCollisionTest {

	@Test
	public void complete_destroyed() {

		Assertions.assertThat(new AsteroidCollision().asteroidCollision(new int[] { -2, -2, 1, -2 }))
				.usingComparator((int[] A, int[] B) -> Arrays.compare(A, B))
				.isEqualTo(new int[] { -2, -2, -2 });
	}
}
