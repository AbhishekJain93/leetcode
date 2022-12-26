import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WiggleSortTest {

	@Test
	public void happy_case() {
		int[] nums = new int[] { 3, 5, 2, 1, 6, 4 };
		new WiggleSort().wiggleSort(nums);
		Assertions.assertArrayEquals(nums, new int[] { 3, 5, 1, 6, 2, 4 });
	}
}
