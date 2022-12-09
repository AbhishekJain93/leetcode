import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {

	@Test
	public void insert_and_get() {
		RandomizedSet rSet = new RandomizedSet();
		Assertions.assertThat(rSet.insert(5)).isEqualTo(true);
		Assertions.assertThat(rSet.getRandom()).isEqualTo(5);
		Assertions.assertThat(rSet.remove(5)).isEqualTo(true);

	}
}
