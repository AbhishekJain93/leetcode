import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecoverArray1743Test {

    @Test
    public void happy_case() {
        Assertions.assertArrayEquals(new RecoverArray1743().restoreArray(new int[][] { { 2, 1 }, { 3, 4 }, { 3, 2 } }),
                new int[] { 1, 2, 3, 4 });
    }
}
