import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheTest {

	@Test
	public void size_three_cache() {
		LRUCache cache = new LRUCache(3);

		cache.put(11, 11);
		cache.put(7, 7);
		cache.put(3, 3);

		Assertions.assertThat(cache.get(11)).isEqualTo(11);
		cache.put(90, 90);
		Assertions.assertThat(cache.get(7)).isEqualTo(-1);

	}

	@Test
	public void size_two_cache() {
		LRUCache cache = new LRUCache(2);

		cache.put(2, 6);
		cache.put(1, 5);
		cache.put(1, 2);

		Assertions.assertThat(cache.get(1)).isEqualTo(2);
		Assertions.assertThat(cache.get(2)).isEqualTo(6);

	}

	@Test
	public void size_ten_cache() {
		LRUCache cache = new LRUCache(10);

		cache.put(10, 13);
		cache.put(3, 17);
		cache.put(6, 11);
		cache.put(10, 5);
		cache.put(9, 10);
		cache.put(2, 19);
		cache.put(5, 25);
		cache.put(9, 22);
		cache.put(5, 5);
		cache.put(1, 30);
		cache.put(9, 12);
		cache.put(4, 30);
		cache.put(9, 3);
		cache.put(6, 14);
		cache.put(3, 1);
		cache.put(3, 1);
		cache.put(10, 11);
		cache.put(2, 14);
		cache.put(11, 4);
		cache.put(12, 24);
		cache.put(5, 18);
		cache.put(7, 23);
		cache.put(3, 27);
		cache.put(2, 12);

		Assertions.assertThat(cache.get(5)).isEqualTo(18);

	}
}
