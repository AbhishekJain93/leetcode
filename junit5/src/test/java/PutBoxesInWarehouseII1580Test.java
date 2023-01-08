import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PutBoxesInWarehouseII1580Test {

	@Test
	public void can_put_from_opposite_end() {

		Assertions.assertThat(new PutBoxesInWarehouseII1580().maxBoxesInWarehouse(
				new int[] { 3, 5, 5, 2 },
				new int[] { 2, 1, 3, 4, 5 })).isEqualTo(3);

	}

	@Test
	public void test_case() {

		Assertions.assertThat(new PutBoxesInWarehouseII1580().maxBoxesInWarehouse(
				new int[] { 18, 4, 10, 7, 6, 19, 17, 9, 24, 10, 12, 20 },
				new int[] { 6, 1, 5, 15, 22, 2, 15, 11, 14, 24, 22, 7, 16, 22, 4, 2, 4 })).isEqualTo(2);

	}

}