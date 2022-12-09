import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameIITest {

	@Test
	public void five_element_array() {
		Assertions.assertThat(new JumpGameII().jump2(new int[] { 2, 3, 1, 1, 4, 1 })).isEqualTo(3);
	}
}
