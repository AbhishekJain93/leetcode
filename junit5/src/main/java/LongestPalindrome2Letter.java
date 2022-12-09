import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome2Letter {

	public int longestPalindrome(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		int result = 0;
		boolean extra = false;
		for (java.util.Map.Entry<String, Integer> e : map.entrySet()) {
			char c1 = e.getKey().charAt(0);
			char c2 = e.getKey().charAt(1);
			if (c1 == c2) {
				extra |= e.getValue() % 2 == 1;
				result += (e.getValue() % 2 == 1 ? e.getValue() - 1 : e.getValue());
			} else if (map.containsKey("" + c2 + c1)) {
				result += Math.min(e.getValue(), map.get("" + c2 + c1));
			}
		}

		return extra ? (result + 1) * 2 : result * 2;
	}
}
