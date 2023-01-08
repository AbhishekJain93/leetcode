import java.util.ArrayList;
import java.util.List;

public class DistinctSubstringsCount1180 {
	public int countLetters(String s) {
		char[] s1 = s.toCharArray();
		int splitLen = 0;
		List<Integer> splits = new ArrayList<>();

		char prev = s1[0];
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == prev) {
				splitLen++;
			} else {
				splits.add(splitLen);
				splitLen = 1;
				prev = s1[i];
			}
		}

		splits.add(splitLen);

		int count = 0;
		for (int i = 0; i < splits.size(); i++) {
			count += (splits.get(i) * (splits.get(i) + 1)) / 2;
		}

		return count;
	}
}
