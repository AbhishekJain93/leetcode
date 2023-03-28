import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DifferOneCharacter1638Test {

    @Test
    public void happy_case() {
        Assertions.assertEquals(new DifferOneCharacter1638().countSubstrings("ab", "bb"), 3);

    }

    @Test
    public void happy_case_2() {
        Assertions.assertEquals(new DifferOneCharacter1638().countSubstrings("aba", "baba"), 6);

    }
}
