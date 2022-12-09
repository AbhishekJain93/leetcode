import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinStackTest {

	@Test
	public void stack_two_elements() {
		MinStack stack = new MinStack();
		stack.push(2);
		stack.push(3);
		stack.push(1);
		Assertions.assertThat(stack.getMin()).isEqualTo(1);
		stack.pop();
		Assertions.assertThat(stack.getMin()).isEqualTo(2);
	}
}
