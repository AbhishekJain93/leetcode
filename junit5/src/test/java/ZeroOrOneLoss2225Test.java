import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZeroOrOneLoss2225Test {

    @Test
    public void happy_case() {

        Assertions.assertEquals(
                new ZeroOrOneLoss2225().findWinners(new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 },
                        { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 }, { 10, 9 } }),
                List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8)));
    }

}