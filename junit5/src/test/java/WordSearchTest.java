import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
	@Test
	public void two_by_two_search() {

		Assertions.assertThat(new WordSearch().exist(
				new char[][] { { 'C', 'S' }, { 'E', 'E' } }, "SEE")).isTrue();
	}
}
