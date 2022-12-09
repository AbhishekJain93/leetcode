import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackUsingQueuesTest {

	@Test
	public void three_elements_push_pop() {

		StackUsingQueues stack = new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		Assertions.assertThat(stack.pop()).isEqualTo(3);
		Assertions.assertThat(stack.pop()).isEqualTo(2);
		Assertions.assertThat(stack.pop()).isEqualTo(1);
	}
}
