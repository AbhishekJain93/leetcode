import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberII213Test {

    @Test
    public void two_houses() {

        Assertions.assertThat(new HouseRobberII213().rob(new int[] { 2, 3, 2 })).isEqualTo(3);
    }

}