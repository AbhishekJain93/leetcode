import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BraceExpansionTest {

	@Test
	public void two_permutations() {
		Assertions.assertArrayEquals(new BraceExpansion1087().expand("{a,b}c"),
				new String[] { "ac", "bc" });
	}

	@Test
	public void multiple_permutations() {
		Assertions.assertArrayEquals(new BraceExpansion1087().expand("{a,b}c{d,e}f"),
				new String[] { "acdf", "acef", "bcdf", "bcef" });
	}
}
