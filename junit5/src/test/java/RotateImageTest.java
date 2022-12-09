import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateImageTest {

	@Test
	public void four_by_four_image() {

		int[][] image = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		int[][] rotated = new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };

		new RotateImage().rotate(image);

		Assertions.assertThat(Arrays.deepEquals(image, rotated)).isTrue();

	}

	@Test
	public void three_by_three_image() {

		int[][] image = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		int[][] rotated = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 }, };

		new RotateImage().rotate(image);

		Assertions.assertThat(Arrays.deepEquals(image, rotated)).isTrue();

	}
}
