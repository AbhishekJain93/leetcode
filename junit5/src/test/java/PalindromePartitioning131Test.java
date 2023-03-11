import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitioning131Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(new PalindromePartitioning131().partition("aab"),
                List.of(List.of("a", "a", "b"), List.of("aa", "b")));
    }

    @Test
    public void happy_case_2() {
        Assertions.assertEquals(new PalindromePartitioning131().partition("abb"),
                List.of(List.of("a", "b", "b"), List.of("a", "bb")));
    }

    @Test
    public void happy_case_3() {
        Assertions.assertEquals(new PalindromePartitioning131().partition("bbab"),
                List.of(List.of("b", "b", "a", "b"), List.of("b", "bab"), List.of("bb", "a", "b")));
    }

    @Test
    public void two_char() {
        Assertions.assertEquals(new PalindromePartitioning131().partition("bb"),
                List.of(List.of("b", "b"), List.of("bb")));
    }
}
