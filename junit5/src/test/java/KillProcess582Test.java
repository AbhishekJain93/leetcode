import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class KillProcess582Test {

	@Test
	public void single_child_process() {

		Assertions.assertThat(new KillProcess582().killProcess(
				List.of(1, 3, 10, 5),
				List.of(3, 0, 5, 3),
				5)).isEqualTo(List.of(5, 10));
	}
}
