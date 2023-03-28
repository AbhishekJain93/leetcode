import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarakaTestTest {

    @Test
    public void three_num_array() {

        Assertions.assertEquals(new BarakaTest().secondLargest(new int[] { 1, 2, 3 }), 2);

    }

    @Test
    public void test_case_1() {

        Assertions.assertEquals(new BarakaTest().secondLargest(new int[] { 9, 10, 8, 0, 3, -1 }), 9);

    }
}
