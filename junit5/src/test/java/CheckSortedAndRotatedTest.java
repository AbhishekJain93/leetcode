import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckSortedAndRotatedTest {

	@Test
	public void rotated_five_elements() {
		Assertions.assertThat(new CheckSortedAndRotated1752().check(new int[] { 3, 4, 5, 1, 2 })).isEqualTo(true);
	}
}
