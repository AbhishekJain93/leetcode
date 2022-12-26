import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SentenceSimilarityTest {

	@Test
	public void similar_sentences() {
		Assertions.assertThat(new SentenceSimilarity().areSentencesSimilar(
				new String[] { "great", "acting", "skills" },
				new String[] { "fine", "drama", "talent" },
				List.of(List.of("great", "fine"), List.of("drama", "acting"), List.of("skills", "talent"))))
				.isEqualTo(true);
	}
}
