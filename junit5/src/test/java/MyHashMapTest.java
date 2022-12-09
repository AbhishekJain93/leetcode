import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

	@Test
	public void put_and_get() {

		MyHashMap map = new MyHashMap();
		map.put(5, 11);

		Assertions.assertThat(map.get(5)).isEqualTo(11);

	}
}
