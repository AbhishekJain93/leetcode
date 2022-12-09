import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomPointerTest {

	@Test
	public void list_with_random_pointer() {
		RandomNode r1 = new RandomNode(5);
		RandomNode r2 = new RandomNode(6);
		RandomNode r3 = new RandomNode(7);
		r1.next = r2;
		r2.next = r3;
		r1.random = r3;
		r3.random = r2;
		r2.random = r1;

		RandomNode list = r1;
		RandomNode copied = new RandomPointer().copyRandomList(list);
		Assertions.assertThat(copied.val).isEqualTo(5);
		Assertions.assertThat(copied.next.val).isEqualTo(6);
		Assertions.assertThat(copied.next.next.val).isEqualTo(7);
		Assertions.assertThat(copied.random.val).isEqualTo(7);
		Assertions.assertThat(copied.next.random.val).isEqualTo(5);
		Assertions.assertThat(copied.next.next.random.val).isEqualTo(6);

	}
}
