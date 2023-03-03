import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucessfulPairs2300Test {

    @Test
    public void three_spells() {

        Assertions.assertThat(new SucessfulPairs2300().successfulPairs(
                new int[] { 5, 1, 3 },
                new int[] { 1, 2, 3, 4, 5 },
                7)).isEqualTo(new int[] { 4, 0, 3 });
    }
}
