import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PutBoxesInWarehouse1564Test {

	@Test
	public void only_one_can_fit() {
		Assertions.assertThat(new PutBoxesInWarehouse1564().maxBoxesInWarehouse(
				new int[] { 1, 2, 3 },
				new int[] { 1, 2, 3, 4 })).isEqualTo(1);

	}

	@Test
	public void not_all_can_fit() {
		Assertions.assertThat(new PutBoxesInWarehouse1564().maxBoxesInWarehouse(
				new int[] { 4, 3, 4, 1 },
				new int[] { 5, 3, 3, 4, 1 })).isEqualTo(3);

	}

	@Test
	public void all_can_fit() {
		Assertions.assertThat(new PutBoxesInWarehouse1564().maxBoxesInWarehouse(
				new int[] { 1, 1, 1, 1, 1, 1, 1, 1 },
				new int[] { 5, 3, 3, 4, 1 })).isEqualTo(5);

	}
}