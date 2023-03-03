import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlipString926Test {
    @Test
    public void one_flip() {

        Assertions.assertThat(new FlipString926().minFlipsMonoIncr("101")).isEqualTo(1);
    }
}
