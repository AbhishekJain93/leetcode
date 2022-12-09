public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();

		int minSize = Integer.MAX_VALUE;
		for (String s : strs) {
			minSize = Math.min(minSize, s.length());
		}

		for (int i = 0; i < minSize; i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != c)
					return sb.toString();
			}
			sb.append(c);
		}

		return sb.toString();
	}
}
