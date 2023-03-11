import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxCircular918Test {

    @Test
    public void sum_including_edges() {
        Assertions.assertEquals(new MaxCircular918().maxSubarraySumCircular(new int[] { 5, -3, 5 }), 10);
    }

    @Test
    public void egdes() {
        Assertions.assertEquals(
                new MaxCircular918().maxSubarraySumCircular(new int[] { -1, 10, -100, 15, -100, 10, -1 }), 18);
    }
}
