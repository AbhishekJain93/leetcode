import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinFuel2477Test {

    @Test
    public void happy_case() {

        Assertions.assertThat(new MinFuel2477().minimumFuelCost(
                new int[][] {
                        { 0, 1 }, { 0, 2 }, { 0, 3 }
                }, 5)).isEqualTo(3);
    }
}
