import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void happy_case() {
		Assertions.assertThat(new ContainerWithMostWater().maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }))
				.isEqualTo(49);

	}

	@Test
	public void width_one() {
		Assertions.assertThat(new ContainerWithMostWater().maxArea(new int[] { 2, 3, 4, 5, 18, 17, 6 }))
				.isEqualTo(17);

	}
}
