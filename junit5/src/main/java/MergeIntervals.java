import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		if (intervals.length < 2)
			return intervals;

		List<int[]> result = new ArrayList<>();
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		int start = intervals[0][0], end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] <= end) {
				end = Math.max(end, intervals[i][1]);
			} else {
				result.add(new int[] { start, end });
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}
		result.add(new int[] { start, end });
		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		System.out.println(Arrays
				.deepToString(new MergeIntervals().merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } })));
	}
}
