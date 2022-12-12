import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompressedStringIteratorTest {

	@Test
	public void consecutive_next_calls() {

		CompressedStringIterator stringIterator = new CompressedStringIterator("L1e2t1C1o1d1e1");
		Assertions.assertThat(stringIterator.next()).isEqualTo('L'); // return "L"
		stringIterator.next(); // return "e"
		stringIterator.next(); // return "e"
		stringIterator.next(); // return "t"
		stringIterator.next(); // return "C"
		stringIterator.next(); // return "o"
		stringIterator.hasNext(); // return True
		stringIterator.next(); // return "d"
		stringIterator.hasNext(); // return True
	}
}
