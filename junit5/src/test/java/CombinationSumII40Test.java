import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumII40Test {

    @Test
    public void happy_case() {

        Assertions.assertEquals(new CombinationSumII40().combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5),
                List.of(List.of(1, 2, 2), List.of(5)));
    }
}
