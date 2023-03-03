import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Minpathcost2304Test {

    @Test
    public void two_by_three() {

        Assertions.assertThat(new Minpathcost2304().minPathCost(
                new int[][] { { 5, 3 }, { 4, 0 }, { 2, 1 } },
                new int[][] { { 9, 8 }, { 1, 5 }, { 10, 12 }, { 18, 6 }, { 2, 4 }, { 14, 3 } })).isEqualTo(17);
    }
}
