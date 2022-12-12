import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HitCounterTest {

	@Test
	public void hit_counter_with_old_values() {
		HitCounter hitCounter = new HitCounter();
		hitCounter.hit(1); // hit at timestamp 1.
		hitCounter.hit(2); // hit at timestamp 2.
		hitCounter.hit(3); // hit at timestamp 3.
		Assertions.assertThat(hitCounter.getHits(4)).isEqualTo(3);
		hitCounter.hit(300); // hit at timestamp 300.
		Assertions.assertThat(hitCounter.getHits(300)).isEqualTo(4);
		Assertions.assertThat(hitCounter.getHits(301)).isEqualTo(3);
		hitCounter.getHits(300); // get hits at timestamp 300, return 4.
		hitCounter.getHits(301); // get hits at timestamp 301, return 3.
	}
}
