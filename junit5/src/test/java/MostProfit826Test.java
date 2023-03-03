import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostProfit826Test {

    @Test
    public void happy_case() {

        Assertions.assertThat(new MostProfit826().maxProfitAssignment(
                new int[] { 2, 4, 6, 8, 10 },
                new int[] { 10, 20, 30, 40, 50 },
                new int[] { 4, 5, 6, 7 })).isEqualTo(100);
    }
}
