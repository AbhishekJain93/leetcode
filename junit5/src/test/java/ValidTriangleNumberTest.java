import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidTriangleNumberTest {

	@Test
	public void all_triplets_form_triangle() {
		Assertions.assertThat(new ValidTriangleNumber().triangleNumber(new int[] { 4, 2, 3, 4 })).isEqualTo(4);
	}
}
