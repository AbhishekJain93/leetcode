import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FallingPath931Test {

    @Test
    public void three_by_three() {
        Assertions.assertEquals(
                new FallingPath931().minFallingPathSum(new int[][] { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } }), 13);

    }
}
