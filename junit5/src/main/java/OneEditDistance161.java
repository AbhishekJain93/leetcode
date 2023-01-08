import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OneEditDistance161 {

	public boolean isOneEditDistance(String s, String t) {
		if (Math.abs(s.length() - t.length()) >= 2)
			return false;

		if (s.length() == t.length()) {
			boolean diff = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == t.charAt(i))
					continue;

				if (diff)
					return false;

				diff = true;
			}
			return diff;
		} else {
			String first = s, second = t;
			boolean diff = false;
			if (s.length() > t.length()) {
				first = t;
				second = s;
			}

			int i = 0, j = 0;
			while (i < first.length()) {
				if (first.charAt(i) == second.charAt(j)) {
					i++;
					j++;
					continue;
				} else {
					if (diff)
						return false;

					diff = true;
					j++;
				}
			}
			return diff || j < second.length();
		}
	}

	public boolean isOneEditDistance2(String s, String t) {
		if (Math.abs(s.length() - t.length()) >= 2)
			return false;

		Map<Character, Integer> mapA = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			mapA.put(s.charAt(i), mapA.getOrDefault(s.charAt(i), 0) + 1);
		}

		Map<Character, Integer> mapB = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			mapB.put(t.charAt(i), mapB.getOrDefault(t.charAt(i), 0) + 1);
		}

		int maxDiff = s.length() == t.length() ? 2 : 1;
		int diff = 0;
		Map<Character, Integer> first, second;
		if (mapA.size() < mapB.size()) {
			first = mapB;
			second = mapA;
		} else {
			first = mapA;
			second = mapB;
		}

		for (Entry<Character, Integer> e : first.entrySet()) {
			int firstCount = e.getValue();
			int secondCount = second.getOrDefault(e.getKey(), 0);

			if (firstCount == secondCount)
				continue;

			if (Math.abs(firstCount - secondCount) >= 2)
				return false;

			diff += 1;
			if (diff > maxDiff)
				return false;

		}

		return diff == maxDiff;
	}
}
