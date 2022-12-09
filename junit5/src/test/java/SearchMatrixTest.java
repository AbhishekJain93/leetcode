import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchMatrixTest {

	@Test
	public void three_row_matrix() {
		Assertions.assertThat(new SearchMatrix().searchMatrix(
				new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 34)).isEqualTo(true);

	}

	@Test
	public void single_cell_matrix() {
		Assertions.assertThat(new SearchMatrix().searchMatrix(
				new int[][] { { 1 } }, 2)).isEqualTo(false);

	}
}
