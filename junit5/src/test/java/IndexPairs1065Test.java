import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexPairs1065Test {

	@Test
	public void overlapping_substrings() {
		Assertions.assertThat(new IndexPairs1065().indexPairs(
				"thestoryofleetcodeandme",
				new String[] { "story", "fleet", "leetcode" })).isEqualTo(
						new int[][] {
								{ 3, 7 }, { 9, 13 }, { 10, 17 }
						});
	}
}
