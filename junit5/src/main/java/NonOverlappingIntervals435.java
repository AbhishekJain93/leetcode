import java.util.Arrays;

public class NonOverlappingIntervals435 {
	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals,
				((a1, a2) -> Integer.compare(a1[1], a2[1])));

		int[] currentInterval = intervals[0];

		int erased = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < currentInterval[1]) {
				erased++;
			} else {
				currentInterval = intervals[i];
			}
		}

		return erased;
	}
}
