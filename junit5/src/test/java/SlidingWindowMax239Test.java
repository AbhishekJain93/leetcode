import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowMax239Test {

    @Test
    public void happy_case() {
        Assertions.assertThat(new SlidingWindowMax239().maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3))
                .isEqualTo(new int[] { 3, 3, 5, 5, 6, 7 });
    }

    @Test
    public void happy_case_2() {
        Assertions.assertThat(new SlidingWindowMax239().maxSlidingWindow(new int[] { 1, -1 }, 1))
                .isEqualTo(new int[] { 1, -1 });
    }
}
