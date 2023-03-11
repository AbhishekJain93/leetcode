import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArray1043Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(
                new PartitionArray1043().maxSumAfterPartitioning(new int[] { 1, 15, 7, 9, 2, 5, 10 }, 3), 84);
    }

    @Test
    public void happy_case_2() {
        Assertions.assertEquals(new PartitionArray1043().maxSumAfterPartitioning(new int[] { 15, 14, 1, 1 }, 3),
                15 + 14 * 3);
    }
}
