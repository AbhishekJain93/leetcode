import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		if (n == 1)
			return List.of("()");

		Set<String> set = new HashSet<>();
		generator(n, 0, 0, new StringBuilder(), set);
		return set.stream().toList();
	}

	private void generator(int n, int open, int close, StringBuilder current, Set<String> combinations) {
		if (open == n && close == n)
			combinations.add(current.toString());

		if (open < n) {
			generator(n, open + 1, close, current.append('('), combinations);
			current.deleteCharAt(current.length() - 1);
		}

		if (close < open) {
			generator(n, open, close + 1, current.append(')'), combinations);
			current.deleteCharAt(current.length() - 1);
		}
	}
}
