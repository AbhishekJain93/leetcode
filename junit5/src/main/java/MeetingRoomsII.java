import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRoomsII {
	public int minMeetingRooms(int[][] intervals) {
		List<Integer> starts = new ArrayList<>();
		List<Integer> ends = new ArrayList<>();

		for (int[] interval : intervals) {
			starts.add(interval[0]);
			ends.add(interval[1]);
		}

		Collections.sort(starts);
		Collections.sort(ends);

		int i = 0, j = 0;
		int max = 0, current = 0;
		while (i < starts.size() && j < ends.size()) {
			if (starts.get(i) < ends.get(j)) {
				current++;
				i++;
			} else if (starts.get(i) > ends.get(j)) {
				current--;
				j++;
			} else {
				i++;
				j++;
			}

			max = Math.max(max, current);
		}

		return max;
	}
}
