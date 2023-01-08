import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FairDistributionOfCookie2305Test {

	@Test
	public void equal_division() {

		Assertions.assertThat(new FairDistributionOfCookie2305().distributeCookies(
				new int[] { 6, 1, 3, 2, 2, 4, 1, 2 }, 3)).isEqualTo(7);
	}

}