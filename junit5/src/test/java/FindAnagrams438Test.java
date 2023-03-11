import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindAnagrams438Test {

    @Test
    public void two_positions() {
        Assertions.assertArrayEquals(new Integer[] { 0, 2 },
                new FindAnagrams438().findAnagrams("abcba", "abc").toArray(new Integer[0]));
    }
}
