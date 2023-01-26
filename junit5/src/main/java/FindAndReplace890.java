import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAndReplace890 {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> res = new ArrayList<>();

		outer: for (int i = 0; i < words.length; i++) {
			String word = words[i];

			if (pattern.length() != word.length())
				continue;

			Set<Character> used = new HashSet<>();
			Map<Character, Character> map = new HashMap<>();

			for (int j = 0; j < pattern.length(); j++) {
				if (map.containsKey(pattern.charAt(j)) && map.get(pattern.charAt(j)) == word.charAt(j))
					continue;
				if (map.containsKey(pattern.charAt(j)))
					continue outer;

				if (used.contains(word.charAt(j)))
					continue outer;

				map.put(pattern.charAt(j), word.charAt(j));
				used.add(word.charAt(j));
			}

			res.add(words[i]);
		}

		return res;
	}
}
