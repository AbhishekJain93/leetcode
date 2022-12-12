import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordDistanceIITest {

	@Test
	public void multiple_duplicates() {

		WordDistanceII wd = new WordDistanceII(new String[] { "practice", "makes", "perfect", "coding", "makes" });
		Assertions.assertThat(wd.shortest("coding", "practice")).isEqualTo(3);
		Assertions.assertThat(wd.shortest("makes", "coding")).isEqualTo(1);

	}
}