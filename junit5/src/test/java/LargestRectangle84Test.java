import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestRectangle84Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(new LargestRectangle84().largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }), 10);
    }
}
