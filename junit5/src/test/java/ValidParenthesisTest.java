import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesisTest {

	@Test
	public void nested_parenthesis() {
		Assertions.assertThat(new ValidParenthesis().isValid("(){()}")).isEqualTo(true);
	}
}
