import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class KeysAndRooms841Test {
	@Test
	public void can_unlock_all() {

		Assertions.assertThat(new KeysAndRooms841().canVisitAllRooms(
				List.of(
						List.of(1, 3),
						List.of(3, 0, 1),
						List.of(2),
						List.of(0))))
				.isEqualTo(false);
	}
}
