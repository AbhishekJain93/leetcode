import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingRangesTest {

	@Test
	public void single_number_and_ranges_missing() {

		Assertions.assertThat(new MissingRanges().findMissingRanges(
				new int[] { 0, 1, 3, 50, 75 }, 0, 99))
				.isEqualTo(List.of("2", "4->49", "51->74", "76->99"));
	}
}
