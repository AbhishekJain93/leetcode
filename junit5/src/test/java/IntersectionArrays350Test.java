import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionArrays350Test {

    @Test
    public void happy_case() {
        int[] res = new IntersectionArrays350().intersect(new int[] { 1, 3, 4, 5, 5, 7 }, new int[] { 5, 3, 7, 5 });
        Arrays.sort(res);
        Assertions.assertThat(res).isEqualTo(new int[] { 3, 5, 5, 7 });
    }
}
