import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NiceSubarrays1248Test {

    @Test
    public void large_number_of_subarrays() {
        Assertions.assertThat(new NiceSubarrays1248().numberOfSubarrays(new int[] { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 }, 2))
                .isEqualTo(16);
    }

    @Test
    public void happy_case_two_nice_arrays() {
        Assertions.assertThat(new NiceSubarrays1248().numberOfSubarrays(new int[] { 1, 1, 2, 1, 1 }, 3)).isEqualTo(2);
    }
}
