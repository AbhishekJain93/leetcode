import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectSquare367Test {

    @Test
    public void not_a_perfect_square() {
        Assertions.assertThat(new PerfectSquare367().isPerfectSquare(14)).isEqualTo(false);
    }

    @Test
    public void perfect_square() {
        Assertions.assertThat(new PerfectSquare367().isPerfectSquare(100)).isEqualTo(true);
    }
}
