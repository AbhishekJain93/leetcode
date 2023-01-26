import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestCommonElementInRows1198Test {

	@Test
	public void four_rows() {

		Assertions.assertThat(new SmallestCommonElementInRows1198().smallestCommonElement(
				new int[][] {
						{ 1, 2, 3, 4, 5 }, { 2, 4, 5, 8, 10 }, { 3, 5, 7, 9, 11 }, { 1, 3, 5, 7, 9 }
				})).isEqualTo(5);
	}
}