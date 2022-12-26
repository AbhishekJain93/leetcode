import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void all_cases_covered() {
		Assertions.assertThat(new FizzBuzz().fizzBuzz(15)).isEqualTo(
				List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
						"FizzBuzz"));

	}
}
