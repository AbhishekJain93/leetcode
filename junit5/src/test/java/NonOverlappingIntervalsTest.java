import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {

	@Test
	public void overlapping_intervals() {
		Assertions.assertThat(new NonOverlappingIntervals435().eraseOverlapIntervals(
				new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } })).isEqualTo(1);

	}
}
