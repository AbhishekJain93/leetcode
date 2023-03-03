import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleArray1470Test {

    @Test
    public void size_six() {

        Assertions.assertThat(new ShuffleArray1470().shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3))
                .isEqualTo(new int[] { 2, 3, 5, 4, 1, 7 });

    }
}
