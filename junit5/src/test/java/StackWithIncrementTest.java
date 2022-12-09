
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackWithIncrementTest {

	@Test
	public void test_increment_last_stack_item() {
		StackWithIncrement stack = new StackWithIncrement(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		stack.increment(1, 5);
		Assertions.assertThat(stack.pop()).isEqualTo(3);
		Assertions.assertThat(stack.pop()).isEqualTo(2);
		Assertions.assertThat(stack.pop()).isEqualTo(6);
	}

	@Test
	public void test_happy_case() {
		StackWithIncrement stack = new StackWithIncrement(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.increment(5, 100);
		stack.increment(2, 100);

		Assertions.assertThat(stack.pop()).isEqualTo(103);
		Assertions.assertThat(stack.pop()).isEqualTo(202);
		Assertions.assertThat(stack.pop()).isEqualTo(201);
		Assertions.assertThat(stack.pop()).isEqualTo(-1);
	}
}
