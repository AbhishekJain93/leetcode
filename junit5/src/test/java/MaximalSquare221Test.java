import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximalSquare221Test {

    @Test
    public void five_by_five_matrix() {
        Assertions.assertEquals(new MaximalSquare221().maximalSquare(
                new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                        { '1', '0', '0', '1', '0' } }),
                4);
    }
}