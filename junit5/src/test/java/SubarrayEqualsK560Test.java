import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarrayEqualsK560Test {

    @Test
    public void happy_case() {
        Assertions.assertThat(new SubarrayEqualsK560().subarraySum(new int[] { 1, 2, 3 }, 3)).isEqualTo(2);
    }
}
