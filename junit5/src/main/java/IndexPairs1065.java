import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndexPairs1065 {

	public int[][] indexPairs(String text, String[] words) {
		Set<String> set = new HashSet<>();
		for (String s : words) {
			set.add(s);
		}

		List<int[]> res = new ArrayList<>();

		for (int i = 0; i < text.length(); i++) {
			for (int j = i; j < text.length(); j++) {
				if (set.contains(text.substring(i, j + 1))) {
					res.add(new int[] { i, j });
				}
			}
		}

		return res.toArray(new int[res.size()][2]);
	}
}
