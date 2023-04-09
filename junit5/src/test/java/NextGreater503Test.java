import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextGreater503Test {

    @Test
    public void wrapped_three_element() {
        Assertions.assertArrayEquals(new NextGreater503().nextGreaterElements(new int[] { 1, 2, 1 }),
                new int[] { 2, -1, 2 });
    }

    @Test
    public void wrapped_five_element() {
        Assertions.assertArrayEquals(new NextGreater503().nextGreaterElements(new int[] { 1, 2, 3, 4, 3 }),
                new int[] { 2, 3, 4, -1, 4 });
    }
}
