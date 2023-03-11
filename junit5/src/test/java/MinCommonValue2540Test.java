import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCommonValue2540Test {

    @Test
    public void second_number_common() {
        Assertions.assertThat(new MinCommonValue2540().getCommon(new int[] { 1, 2, 3 }, new int[] { 0, 3, 6 }))
                .isEqualTo(3);

    }
}
