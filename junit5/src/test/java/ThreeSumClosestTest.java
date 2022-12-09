import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

	@Test
	public void off_by_one() {
		Assertions.assertThat(new ThreeSumClosest().threeSumClosest(new int[] { -1, 2, 1, -4 }, 1)).isEqualTo(2);
	}
}
