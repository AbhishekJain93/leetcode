import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateParenthesisTest {

	@Test
	public void two_pairs() {
		Assertions.assertThat(new GenerateParenthesis().generateParenthesis(2)).isEqualTo(
				List.of("()()", "(())"));

	}
}
