import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

	@Test
	public void minimum_path_sum() {
		List<List<Integer>> input = new ArrayList<>();
		input.add(List.of(2));
		input.add(List.of(3, 4));
		input.add(List.of(6, 5, 7));
		input.add(List.of(4, 1, 8, 3));
		Assertions.assertThat(new Triangle().minimumTotal2(input))
				.isEqualTo(11);
	}
}
