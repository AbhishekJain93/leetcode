import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CampusBikes1057Test {

	@Test
	public void two_workers_two_bikes() {
		assertArrayEquals(new int[] { 1, 0 }, new CampusBikes1057().assignBikes(
				new int[][] { { 0, 0 }, { 2, 1 } },
				new int[][] { { 1, 2 }, { 3, 3 } }));
	}
}
