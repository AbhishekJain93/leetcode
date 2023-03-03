import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Temperature739Test {

    @Test
    public void happy() {
        Assertions.assertThat(new Temperature739().dailyTemperatures(
                new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })).isEqualTo(
                        new int[] { 1, 1, 4, 2, 1, 1, 0, 0 });
    }
}