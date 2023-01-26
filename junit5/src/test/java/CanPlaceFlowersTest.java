import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

	@Test
	public void unable_to_place_flowers() {

		Assertions.assertThat(new CanPlaceFlowers605().canPlaceFlowers(
				new int[] { 1, 0, 0, 0, 1 }, 2)).isFalse();
	}

	@Test
	public void cam_place_flowers() {

		Assertions.assertThat(new CanPlaceFlowers605().canPlaceFlowers(
				new int[] { 1, 0, 0, 0, 1 }, 1)).isTrue();
	}

}
