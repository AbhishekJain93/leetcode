import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Permutations46Test {

    @Test
    public void three_factorial() {
        Assertions.assertEquals(new Permutations46().permute(new int[] { 1, 2, 3 }), List.of(List.of(1, 2, 3),
                List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)));
    }
}
