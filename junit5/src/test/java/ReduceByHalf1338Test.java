import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceByHalf1338Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(new ReduceByHalf1338().minSetSize(new int[] { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 }), 2);
    }

    @Test
    public void non_duplicate_elements() {
        Assertions.assertEquals(new ReduceByHalf1338().minSetSize(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }), 5);
    }
}
