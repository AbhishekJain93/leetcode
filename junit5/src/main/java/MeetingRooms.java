import java.util.Arrays;

public class MeetingRooms {
	public boolean canAttendMeetings(int[][] intervals) {
		Arrays.sort(intervals,
				(int[] i1, int[] i2) -> Integer.compare(i1[0], i2[0]));

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < intervals[i - 1][1])
				return false;
		}

		return true;
	}
}
