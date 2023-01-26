import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTransformedArray360Test {

	@Test
	public void negative_a() {
		Assertions.assertArrayEquals(new SortTransformedArray360().sortTransformedArray(
				new int[] { -4, -2, 2, 4 }, -1, 3, 5), new int[] { -23, -5, 1, 7 });
	}
}
