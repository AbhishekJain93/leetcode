import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupShiftedStringTest {

	@Test
	public void multiple_groups() {
		Assertions.assertThat(new GroupShiftedString().groupStrings(
				new String[] { "abc", "bcd", "acef", "xyz", "az", "ba", "a", "z" })).isEqualTo(
						List.of(List.of("a", "z"), List.of("acef"), List.of("abc", "bcd", "xyz"), List.of("az", "ba")));
	}
}
