import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortByFreq451Test {

    @Test
    public void happy_case() {
        Assertions.assertThat(new SortByFreq451().frequencySort("tree")).isEqualTo("eert");
    }
}
