import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestDistanceToTargetColor1182 {
	public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1, new ArrayList<>());
		map.put(2, new ArrayList<>());
		map.put(3, new ArrayList<>());
		for (int i = 0; i < colors.length; i++) {
			map.get(colors[i]).add(i);
		}

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < queries.length; i++) {
			if (map.get(queries[i][1]).isEmpty())
				res.add(-1);
			else
				res.add(nearestIndex(map.get(queries[i][1]), queries[i][0], 0, map.get(queries[i][1]).size() - 1));
		}

		return res;
	}

	public int nearestIndex(List<Integer> list, int val, int start, int end) {
		if (start == end)
			return Math.abs(list.get(start) - val);
		else if (end - start == 1) {
			return Math.min((Math.abs(val - list.get(start))), Math.abs(list.get(end) - val));
		}

		int mid = start + (end - start) / 2;

		if (list.get(mid).equals(val)) {
			return 0;
		} else if (list.get(mid) < (val)) {
			return nearestIndex(list, val, mid, end);
		} else {
			return nearestIndex(list, val, start, mid);
		}
	}
}
