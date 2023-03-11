import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllPathsSToT797Test {
    @Test
    public void five_nodes() {
        Assertions.assertEquals(
                new AllPathsSToT797().allPathsSourceTarget(new int[][] { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} }),
                List.of(List.of(0, 4), List.of(0, 3, 4), List.of(0, 1, 3, 4), List.of(0, 1, 2, 3, 4),
                        List.of(0, 1, 4)));

    }

}