import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

	@Test
	public void num_rows_five() {

		Assertions.assertThat(new PascalTriangle().generate(5)).isEqualTo(
				List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1),
						List.of(1, 4, 6, 4, 1)));
	}
}
