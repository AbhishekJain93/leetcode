import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

	// pwwkew
	public int lengthOfLongestSubstring(String s) {
		char[] s1 = s.toCharArray();
		int left = 0, right = 0, max = 0;
		Map<Character, Integer> freq = new HashMap<>();

		while (right < s1.length) {
			if (!freq.containsKey(s1[right]) || freq.get(s1[right]) == 0) {
				freq.put(s1[right], 1);
				right++;
			} else {
				freq.put(s1[left], 0);
				left++;
			}

			max = Math.max(max, right - left);
		}

		return max;
	}
}
