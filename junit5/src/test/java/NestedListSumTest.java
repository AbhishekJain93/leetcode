import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NestedListSumTest {

	@Test
	public void three_levels_list() {

		List<NestedInteger> list = new ArrayList<>();
		list.add(new NestedIntegerImpl());
		Assertions.assertThat(new NestedListSum().depthSum(list)).isEqualTo(0);
	}
}
