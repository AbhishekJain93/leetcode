import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

	@Test
	public void happy_case() {
		Assertions.assertThat(new MajorityElement().majorityElement(new int[] { 1, 5, 2, 5, 3, 5, 4, 5, 5, 7, 5 }))
				.isEqualTo(5);
	}

	@Test
	public void happy_case_three_elements() {
		Assertions.assertThat(new MajorityElement().majorityElement(new int[] { 3, 3, 4 }))
				.isEqualTo(3);
	}
}
