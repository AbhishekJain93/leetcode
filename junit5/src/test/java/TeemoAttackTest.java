import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeemoAttackTest {

	@Test
	public void counter_reset() {

		Assertions.assertThat(new TeemoAttack()
				.findPoisonedDuration(new int[] { 1, 2 }, 2)).isEqualTo(3);
	}
}
