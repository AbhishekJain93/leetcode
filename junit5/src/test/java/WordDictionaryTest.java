import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordDictionaryTest {

	@Test
	public void seach_word_in_dictionary() {
		WordDictionary dict = new WordDictionary();
		Assertions.assertThat(dict.search("adam")).isEqualTo(false);
		dict.addWord("adam");

		Assertions.assertThat(dict.search("adam")).isEqualTo(true);

	}

	@Test
	public void seach_word_with_wildcard() {
		WordDictionary dict = new WordDictionary();
		Assertions.assertThat(dict.search(".d.m")).isEqualTo(false);
		dict.addWord("adam");

		Assertions.assertThat(dict.search(".da.")).isEqualTo(true);

	}

	@Test
	public void prefix_word_with_wildcard() {
		WordDictionary dict = new WordDictionary();

		dict.addWord("a");
		dict.addWord("ab");
		// Assertions.assertThat(dict.search("a")).isEqualTo(true);
		Assertions.assertThat(dict.search("ab")).isEqualTo(true);

	}
}
