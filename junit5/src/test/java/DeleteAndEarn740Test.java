import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteAndEarn740Test {

    @Test
    public void happy_case() {
        Assertions.assertThat(new DeleteAndEarn740().deleteAndEarn(
                new int[] { 2, 2, 3, 3, 3, 4 })).isEqualTo(9);
    }
}
