import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BombEnemyTest {

	@Test
	public void three_kills_four_by_three() {
		Assertions.assertThat(new BombEnemy().maxKilledEnemies(
				new char[][] {
						{ '0', 'E', '0', '0' }, { 'E', '0', 'W', 'E' }, { '0', 'E', '0', '0' }
				})).isEqualTo(3);

	}

	@Test
	public void one_kill_one_by_two() {
		Assertions.assertThat(new BombEnemy().maxKilledEnemies(
				new char[][] {
						{ '0', 'E' }
				})).isEqualTo(1);

	}
}
