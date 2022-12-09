import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

	@Test
	public void two_houses() {

		Assertions.assertThat(new HouseRobber().rob(new int[] { 5, 7 })).isEqualTo(7);
	}

}
