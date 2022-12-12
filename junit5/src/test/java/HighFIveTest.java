import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HighFIveTest {

	@Test
	public void two_students() {

		Assertions.assertThat(new HighFive().highFive(
				new int[][] { { 1, 100 }, { 7, 100 }, { 1, 100 }, { 7, 100 }, { 1, 100 }, { 7, 100 }, { 1, 100 },
						{ 7, 100 }, { 1, 100 }, { 7, 100 } }))
				.isDeepEqualTo(
						new int[][] { { 1, 100 }, { 7, 100 } });

	}
}
