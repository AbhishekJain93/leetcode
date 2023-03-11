import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KConcat1191Test {

    @Test
    public void total_array_sum_posititve() {
        Assertions.assertEquals(new KConcat1191().kConcatenationMaxSum(new int[] { 1, 2, -1 }, 3), 7);
    }

    @Test
    public void total_array_sum_zero() {
        Assertions.assertEquals(new KConcat1191().kConcatenationMaxSum(new int[] { 1, -2, 1 }, 5), 2);
    }
}
