import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WaysToSplit1573Test {

	@Test
	public void four_ways() {
		Assertions.assertThat(new WaysToSplit1573().numWays("10101")).isEqualTo(4);
	}
}
