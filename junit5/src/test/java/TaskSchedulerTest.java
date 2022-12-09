import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {

	@Test
	public void tasks_length_greated_than_arrangement() {
		Assertions.assertThat(new TaskScheduler().leastInterval(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 2))
				.isEqualTo(8);

	}
}
