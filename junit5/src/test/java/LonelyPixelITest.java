import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LonelyPixelITest {

	@Test
	public void three_lonely_pixels() {

		Assertions.assertThat(new LonelyPixel().findLonelyPixel(new char[][] {
				{ 'W', 'W', 'B' },
				{ 'W', 'B', 'W' },
				{ 'B', 'W', 'W' }
		})).isEqualTo(3);
	}
}
