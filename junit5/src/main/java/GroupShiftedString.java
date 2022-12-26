import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedString {
	public List<List<String>> groupStrings(String[] strings) {
		Map<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			StringBuilder sb = new StringBuilder();
			char[] s1 = strings[i].toCharArray();

			for (int j = 1; j < s1.length; j++) {
				sb.append(((s1[j] - s1[j - 1]) + 26) % 26).append(':'); // +26 needed for case like (az, ba) and :
																		// needed to segregate 18 (2 character diff)
																		// from 1:8 (3 character diff)
			}

			map.putIfAbsent(sb.toString(), new ArrayList<>());
			map.get(sb.toString()).add(strings[i]);
		}

		return new ArrayList<List<String>>(map.values());
	}
}
