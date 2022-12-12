import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovingAverageTest {

	@Test
	public void happy_case() {
		MovingAverage movingAverage = new MovingAverage(3);
		Assertions.assertThat(movingAverage.next(1)).isEqualTo(1); // return 1.0 = 1 / 1
		Assertions.assertThat(movingAverage.next(10)).isEqualTo(5.5); // return 5.5 = (1 + 10) / 2
		movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
		movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3

	}
}
