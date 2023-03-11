import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArray2161Test {

    @Test
    public void happy_case() {
        Assertions.assertThat(new PartitionArray2161().pivotArray(new int[] { 9, 12, 5, 10, 14, 3, 10 }, 10))
                .isEqualTo(new int[] { 9, 5, 3, 10, 10, 12, 14 });
    }
}
