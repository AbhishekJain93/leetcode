import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingRoomsIITest {

	@Test
	public void overlapping_intervals() {
		Assertions.assertThat(new MeetingRoomsII().minMeetingRooms(new int[][] {
				{ 0, 30 },
				{ 5, 10 },
				{ 15, 20 },
		})).isEqualTo(2);

	}

	@Test
	public void two_intervals() {
		Assertions.assertThat(new MeetingRoomsII().minMeetingRooms(new int[][] {
				{ 13, 15 },
				{ 1, 13 },
		})).isEqualTo(1);

	}
}
