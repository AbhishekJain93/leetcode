import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArraysTest {

	@Test
	public void similar_arrays() {
		int[] n1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] n2 = new int[] { 1, 2, 3 };

		new MergeSortedArrays().merge(n1, 3, n2, 3);
		Assertions.assertThat(n1).usingComparator((int[] x, int[] y) -> Arrays.compare(x, y))
				.isEqualTo(new int[] { 1, 1, 2, 2, 3, 3 });
	}

	@Test
	public void another_arrays() {
		int[] n1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] n2 = new int[] { 2, 5, 6 };

		new MergeSortedArrays().merge(n1, 3, n2, 3);
		Assertions.assertThat(n1).usingComparator((int[] x, int[] y) -> Arrays.compare(x, y))
				.isEqualTo(new int[] { 1, 2, 2, 3, 5, 6 });
	}
}
