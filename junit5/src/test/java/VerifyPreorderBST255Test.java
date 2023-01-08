import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class VerifyPreorderBST255Test {

	@Test
	public void valid_bst() {
		Assertions.assertThat(new VerifyPreorderBST255().verifyPreorder2(
				new int[] { 5, 2, 1, 3, 6 })).isEqualTo(true);
	}

	@Test
	public void invalid_bst() {
		Assertions.assertThat(new VerifyPreorderBST255().verifyPreorder2(
				new int[] { 5, 2, 6, 1, 3 })).isEqualTo(false);
	}

	@Test
	public void invalid_bst_2() {
		Assertions.assertThat(new VerifyPreorderBST255().verifyPreorder2(
				new int[] { 11, 9, 3, 4, 1, 6, 10 })).isEqualTo(false);
	}

	@Test
	public void invalid_bst_3() {
		Assertions.assertThat(new VerifyPreorderBST255().verifyPreorder2(
				new int[] { 8, 4, 5, 2, 9 })).isEqualTo(false);
	}
}