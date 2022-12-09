import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottenApplesTest {

	@Test
	public void apples_eaten_after_last_day() {
		Assertions.assertThat(new RottenApples().eatenApples(new int[] { 1, 2, 3, 5, 2 }, new int[] { 3, 2, 1, 4, 2 }))
				.isEqualTo(7);
	}
}
