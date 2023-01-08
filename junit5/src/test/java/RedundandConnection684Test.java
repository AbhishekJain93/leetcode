import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RedundandConnection684Test {

	@Test
	public void five_nodes() {
		Assertions.assertArrayEquals(new int[] { 1, 4 },
				new RedundandConnection684().findRedundantConnection(
						new int[][] {
								{ 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 1, 5 }
						}));
	}
}
