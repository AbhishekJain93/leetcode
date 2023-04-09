import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWords2135Test {

    @Test
    public void happy_case() {

        Assertions.assertEquals(new CountWords2135().wordCount(
                new String[] { "ant", "act", "tack" },
                new String[] { "tack", "act", "acti" }), 2);
    }
}
