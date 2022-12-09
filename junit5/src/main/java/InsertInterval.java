import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	public int[][] insertInterval(int[][] interval, int[] newInterval) {
		List<int[]> result = new ArrayList<>();

		int i = 0, start = newInterval[0], end = newInterval[1];
		while (i < interval.length && interval[i][1] < newInterval[0]) {
			result.add(interval[i]);
			i++;
		}

		while (i < interval.length && end >= interval[i][0]) {
			start = Math.min(interval[i][0], start);
			end = Math.max(interval[i][1], end);
			i++;
		}

		result.add(new int[] { start, end });

		while (i < interval.length) {
			result.add(interval[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}
}
