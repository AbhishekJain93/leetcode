import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
		if (digits.isEmpty())
			return List.of();

		Map<Character, List<String>> map = new HashMap<>();
		map.put('2', List.of("a", "b", "c"));
		map.put('3', List.of("d", "e", "f"));
		map.put('4', List.of("g", "h", "i"));
		map.put('5', List.of("j", "k", "l"));
		map.put('6', List.of("m", "n", "o"));
		map.put('7', List.of("p", "q", "r", "s"));
		map.put('8', List.of("t", "u", "v"));
		map.put('9', List.of("w", "x", "y", "z"));

		char[] digits1 = digits.toCharArray();

		return LetterCombinationsHelper(digits1, 0, map).stream().map(StringBuilder::toString).toList();

	}

	private List<StringBuilder> LetterCombinationsHelper(char[] digits1, int idx, Map<Character, List<String>> map) {
		List<StringBuilder> result = new ArrayList<>();
		if (idx == digits1.length - 1) {
			for (String c : map.get(digits1[idx])) {
				result.add(new StringBuilder(c));
			}

			return result;
		}

		List<StringBuilder> current = LetterCombinationsHelper(digits1, idx + 1, map);
		for (String c : map.get(digits1[idx])) {
			for (StringBuilder sb : current) {
				result.add(new StringBuilder().append(c).append(sb.toString()));
			}
		}

		return result;
	}
}
