import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InsertIntervalTest {

	@Test
	void insert_interval_non_overlapping() {
		assertThat(new InsertInterval().insertInterval(new int[][] { { 3, 4 } }, new int[] { 1, 2 }))
				.isEqualTo(new int[][] { { 1, 2 }, { 3, 4 } });

	}
}
