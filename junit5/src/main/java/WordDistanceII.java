import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistanceII {

	Map<String, List<Integer>> map = new HashMap<>();

	public WordDistanceII(String[] wordsDict) {
		for (int i = 0; i < wordsDict.length; i++) {
			if (map.containsKey(wordsDict[i])) {
				map.get(wordsDict[i]).add(i);
			} else {
				List<Integer> indexes = new ArrayList<>();
				indexes.add(i);
				map.put(wordsDict[i], indexes);
			}
		}
	}

	public int shortest(String word1, String word2) {

		int min = Integer.MAX_VALUE;
		List<Integer> idx1 = map.get(word1);
		List<Integer> idx2 = map.get(word2);

		int p1 = 0, p2 = 0;

		while (p1 < idx1.size() && p2 < idx2.size()) {
			min = Math.min(Math.abs(idx1.get(p1) - idx2.get(p2)), min);
			if (idx1.get(p1) < idx2.get(p2))
				p1++;
			else
				p2++;
		}

		return min;

	}
}
