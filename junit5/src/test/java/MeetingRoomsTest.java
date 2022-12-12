import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingRoomsTest {

	@Test
	public void overlapping_intervals_cant_attend() {
		Assertions.assertThat(new MeetingRooms().canAttendMeetings(new int[][] { { 0, 30 }, { 5, 10 }, { 15, 20 } }))
				.isEqualTo(false);
	}
}
