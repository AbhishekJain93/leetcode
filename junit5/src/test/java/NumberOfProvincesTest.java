import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

	@Test
	public void two_provinces() {

		Assertions.assertThat(new NumberOfProvinces().findCircleNum(
				new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } })).isEqualTo(2);

	}
}
