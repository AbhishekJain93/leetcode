import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianFinderTest {

	@Test
	public void running_median_five_elements() {
		MedianFinder medianF = new MedianFinder();
		medianF.addNum(5);
		medianF.addNum(7);
		medianF.addNum(1);
		Assertions.assertThat(medianF.findMedian()).isEqualTo(5);
		medianF.addNum(2);
		medianF.addNum(6);
		Assertions.assertThat(medianF.findMedian()).isEqualTo(5);
		medianF.addNum(8);
		Assertions.assertThat(medianF.findMedian()).isEqualTo(5.5d);
	}
}
