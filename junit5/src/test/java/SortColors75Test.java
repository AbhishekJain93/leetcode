import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortColors75Test {

    @Test
    public void happy_case() {
        int[] input = new int[] { 2, 0, 2, 1, 1, 0 };
        new SortColors75().sortColors(input);
        Assertions.assertThat(input).isEqualTo(new int[] { 0, 0, 1, 1, 2, 2 });
    }
}
