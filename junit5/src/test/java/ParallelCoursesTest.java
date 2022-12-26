import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParallelCoursesTest {

	@Test
	public void disjoint_graph() {
		Assertions.assertThat(new ParallelCourses().minimumSemesters3(
				3, new int[][] { { 1, 3 }, { 2, 3 } })).isEqualTo(2);
	}
}
