import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchRotatedArrayTest {

	@Test
	public void element_is_pivot() {
		Assertions.assertThat(new SearchRotatedArray().search(new int[] { 5, 6, 7, 0, 1, 2, 3, 4 }, 7)).isEqualTo(2);
	}
}
