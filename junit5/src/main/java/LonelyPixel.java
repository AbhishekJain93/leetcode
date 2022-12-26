import java.util.HashMap;
import java.util.Map;

public class LonelyPixel {
	public int findLonelyPixel(char[][] picture) {
		Map<Integer, Integer> rows = new HashMap<>();
		Map<Integer, Integer> cols = new HashMap<>();

		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[0].length; j++) {
				if (picture[i][j] == 'B') {
					rows.put(i, rows.getOrDefault(i, 0) + 1);
					cols.put(j, cols.getOrDefault(j, 0) + 1);
				}
			}
		}

		int lonely = 0;
		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[0].length; j++) {
				if (picture[i][j] == 'B' && rows.get(i) == 1 && cols.get(j) == 1)
					lonely++;
			}
		}

		return lonely;
	}
}
