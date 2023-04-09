import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumCost1130Test {

    @Test
    public void three_leaves() {
        Assertions.assertEquals(new MinimumCost1130().mctFromLeafValues(new int[] { 6, 2, 4 }), 32);
    }

    @Test
    public void two_leaves() {
        Assertions.assertEquals(new MinimumCost1130().mctFromLeafValues(new int[] { 4, 11 }), 44);
    }
}
