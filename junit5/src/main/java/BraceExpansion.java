import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BraceExpansion {

	public String[] expand(String s) {
		char[] s1 = s.toCharArray();

		List<List<Character>> parts = new ArrayList<>();

		for (int i = 0; i < s1.length; i++) {
			if (Character.isAlphabetic(s1[i])) {
				parts.add(List.of(s1[i]));
			} else if (s1[i] == '{') {
				List<Character> current = new ArrayList<>();

				while (s1[++i] != '}') {
					if (Character.isAlphabetic(s1[i])) {
						current.add(s1[i]);
					}
				}
				parts.add(current);
			}
		}

		List<StringBuilder> state = expandHelper(parts, 0, List.of(new StringBuilder()));
		String[] result = new String[state.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = state.get(i).toString();
		}
		Arrays.sort(result);
		return result;
	}

	private List<StringBuilder> expandHelper(List<List<Character>> parts, int idx, List<StringBuilder> state) {
		if (idx == parts.size())
			return state;

		List<Character> part = parts.get(idx);

		if (part.size() == 1) {
			for (StringBuilder sb : state) {
				sb.append(part.get(0));
			}

			return expandHelper(parts, idx + 1, state);
		}

		List<StringBuilder> newState = new ArrayList<>();
		for (int i = 0; i < part.size(); i++) {
			for (StringBuilder sb : state) {
				newState.add(new StringBuilder(sb).append(part.get(i)));
			}
		}

		return expandHelper(parts, idx + 1, newState);
	}
}
