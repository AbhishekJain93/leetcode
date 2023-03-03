import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionEqual416Test {

    @Test
    public void single_element_equals_half_sum() {
        Assertions.assertThat(new PartitionEqual416().canPartition(
                new int[] { 1, 5, 11, 5 })).isEqualTo(true);
    }
}
