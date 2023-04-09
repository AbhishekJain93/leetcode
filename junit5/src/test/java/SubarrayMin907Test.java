import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarrayMin907Test {

    @Test
    public void happy_case() {

        Assertions.assertEquals(new SubarrayMin907().sumSubarrayMins(new int[] { 3, 1, 2, 4 }), 17);
    }
}
