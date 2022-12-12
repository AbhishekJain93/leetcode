import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeightQueueReconstructTest {

	@Test
	public void happy_case() {
		int[][] reconstructedQ = new HeightQueueReconstruct().reconstructQueue(new int[][] {
				{ 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 }
		});

		Assertions.assertArrayEquals(reconstructedQ, new int[][] {
				{ 5, 0 }, { 7, 0 }, { 5, 2 }, { 6, 1 }, { 4, 4 }, { 7, 1 }
		});
	}
}
