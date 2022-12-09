import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueUsingStackTest {

	@Test
	public void two_elements_pushed() {
		QueueUsingStack q = new QueueUsingStack();
		q.push(1);
		q.push(2);
		Assertions.assertThat(q.empty()).isEqualTo(false);
		Assertions.assertThat(q.pop()).isEqualTo(1);
		Assertions.assertThat(q.pop()).isEqualTo(2);
		Assertions.assertThat(q.empty()).isEqualTo(true);
	}
}
