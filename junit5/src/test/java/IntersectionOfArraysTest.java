import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfArraysTest {

	@Test
	public void all_elements_common() {
		Assertions.assertThat(new IntersectionOfArrays().intersection(
				new int[] { 7, 7, 1, 2, 2 }, new int[] { 3, 7, 2, 1, 2 })).isEqualTo(Set.of(7, 2, 1));
	}
}
