import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalPrices1475Test {

    @Test
    public void happy_case_1() {
        Assertions.assertArrayEquals(new FinalPrices1475().finalPrices(new int[] { 8, 4, 6, 2, 3 }),
                new int[] { 4, 2, 4, 2, 3 });

    }
}
