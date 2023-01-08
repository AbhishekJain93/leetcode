import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsFarAsPossible1162Test {

	@Test
	public void corner_water() {
		Assertions.assertThat(new AsFarAsPossible1162().maxDistance(
				new int[][] {
						{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }
				})).isEqualTo(4);
	}
}
