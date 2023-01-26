import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

	@Test
	public void single_edge_graph() {
		Assertions.assertThat(new CourseSchedule207().canFinish(2, new int[][] { { 0, 1 }, })).isEqualTo(true);

	}
}
