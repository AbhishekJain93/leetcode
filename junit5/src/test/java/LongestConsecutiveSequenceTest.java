import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

	@Test
	public void numbers_close_to_each_other() {
		Assertions
				.assertThat(
						new LongestConsecutiveSequence()
								.longestConsecutive2(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }))
				.isEqualTo(9);
	}

	@Test
	public void repeatedNumbers() {
		Assertions
				.assertThat(
						new LongestConsecutiveSequence().longestConsecutive2(new int[] { 1, 2, 0, 1 }))
				.isEqualTo(3);
	}

}