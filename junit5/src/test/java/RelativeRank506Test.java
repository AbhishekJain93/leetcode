import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelativeRank506Test {
    @Test
    public void five_positions() {
        Assertions.assertArrayEquals(new RelativeRank506().findRelativeRanks(new int[] { 5, 4, 3, 2, 1 }),
                new String[] { "Gold Medal", "Silver Medal", "Bronze Medal", "4", "5" });

    }
}
