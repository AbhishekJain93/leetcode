
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesInPlaceTest {

	@Test
	public void duplicates_for_every_element() {
		int[] nums = new int[] { 1, 1, 2, 2, 3, 3, 4, 4 };
		Assertions.assertThat(new RemoveDuplicatesInPlace().removeDuplicates(nums)).isEqualTo(4);
	}
}
