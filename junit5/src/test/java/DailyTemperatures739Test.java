import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DailyTemperatures739Test {

    @Test
    public void happy_case() {
        Assertions.assertArrayEquals(new DailyTemperatures739().dailyTemperatures(
                new int[] { 73, 74, 75, 71, 69, 72, 76, 73 }), new int[] { 1, 1, 4, 2, 1, 1, 0, 0 });
    }
}
