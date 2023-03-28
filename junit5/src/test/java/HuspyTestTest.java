import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HuspyTestTest {

    @Test
    public void duplicates_in_input() {
        Assertions.assertArrayEquals(new HuspyTest().arrayIntersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }),
                new int[] { 2 });
    }

    @Test
    public void duplicates_in_input_2() {
        Assertions.assertArrayEquals(
                new HuspyTest().arrayIntersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }),
                new int[] { 4, 9 });
    }

    @Test
    public void duplicates_in_input_allowed() {
        Assertions.assertArrayEquals(
                new HuspyTest().arrayIntersectionWithDuplicates(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }),
                new int[] { 2, 2 });
    }

    @Test
    public void duplicates_in_input_2_allowed() {
        Assertions.assertArrayEquals(new HuspyTest().arrayIntersectionWithDuplicates(new int[] { 5, 4, 9, 5, 5, 5, 5 },
                new int[] { 9, 4, 5, 5, 5, 9, 8, 4, 2, 1 }), new int[] { 5, 5, 5, 4, 9 });
    }

    @Test
    public void array_contains_negative() {
        Assertions.assertArrayEquals(new HuspyTest2().arraySquared(new int[] { 3, -1, 1, 2 }),
                new int[] { 1, 1, 4, 9 });
    }
}
