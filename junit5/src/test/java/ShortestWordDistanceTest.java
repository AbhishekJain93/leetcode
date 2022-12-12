import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestWordDistanceTest {

	@Test
	public void repeated_words() {
		Assertions
				.assertThat(new ShortestWordDistance()
						.shortestDistance2(new String[] { "practice", "makes", "perfect", "coding", "makes" },
								"coding", "practice"))
				.isEqualTo(3);
	}
}
