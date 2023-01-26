import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindAndReplace890Test {

	@Test
	public void match_1() {

		Assertions.assertThat(new FindAndReplace890().findAndReplacePattern(
				new String[] { "abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb")).isEqualTo(List.of("mee", "aqq"));

	}
}
