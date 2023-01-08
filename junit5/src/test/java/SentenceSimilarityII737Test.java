import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SentenceSimilarityII737Test {

	@Test
	public void transitive_similar() {
		Assertions.assertThat(new SentenceSimilarityII737().areSentencesSimilarTwo(
				new String[] { "great", "acting", "skills" },
				new String[] { "fine", "drama", "talent" },
				List.of(List.of("great", "good"), List.of("fine", "good"), List.of("drama", "acting"),
						List.of("skills", "talent"))))
				.isEqualTo(true);
	}

	@Test
	public void transitive_similar_big_chain() {
		Assertions.assertThat(new SentenceSimilarityII737().areSentencesSimilarTwo(
				new String[] { "I", "love", "leetcode" },
				new String[] { "I", "love", "onepiece" },
				List.of(List.of("manga", "onepiece"), List.of("platform", "anime"), List.of("leetcode", "platform"),
						List.of("anime", "manga"))))
				.isEqualTo(true);
	}

	@Test
	public void not_similar_big_chain() {
		Assertions.assertThat(new SentenceSimilarityII737().areSentencesSimilarTwo(
				new String[] { "I", "love", "leetcode" },
				new String[] { "I", "love", "onepiece" },
				List.of(List.of("manga", "hxh"), List.of("platform", "anime"), List.of("leetcode", "platform"),
						List.of("anime", "manga"))))
				.isEqualTo(false);
	}

	@Test
	public void transitive_similar_2() {
		Assertions.assertThat(new SentenceSimilarityII737().areSentencesSimilarTwo(
				new String[] { "a", "very", "delicious", "meal" },
				new String[] { "one", "really", "delicious", "dinner" },
				List.of(
						// List.of("great", "good"),
						// List.of("extraordinary", "good"),
						// List.of("well", "good"),
						// List.of("wonderful", "good"),
						// List.of("excellent", "good"),
						// List.of("fine", "good"),
						// List.of("nice", "good"),
						// List.of("excellent", "good"),
						// List.of("any", "one"),
						// List.of("some", "one"),
						// List.of("unique", "one"),
						// List.of("the", "one"),
						// List.of("an", "one"),
						// List.of("single", "one"),
						List.of("a", "one"),
						// List.of("truck", "car"),
						// List.of("wagon", "car"),
						// List.of("automobile", "car"),
						// List.of("auto", "car"),
						// List.of("vehicle", "car"),
						// List.of("entertain", "have"),
						// List.of("drink", "have"),
						// List.of("eat", "have"),
						// List.of("take", "have"),
						// List.of("fruits", "meal"),
						// List.of("brunch", "meal"),
						// List.of("breakfast", "meal"),
						// List.of("food", "meal"),
						List.of("dinner", "meal"),
						List.of("super", "meal"),
						// List.of("lunch", "meal"),
						// List.of("possess", "own"),
						// List.of("keep", "own"),
						// List.of("have", "own"),
						// List.of("extremely", "very"),
						// List.of("actually", "very"),
						List.of("really", "very"),
						List.of("super", "very"))))
				.isEqualTo(true);
	}

}