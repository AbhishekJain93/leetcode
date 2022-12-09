import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {

	public List<Integer> partitionLabels(String s) {
		Map<Character, Integer> idxMap = new HashMap<>();
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			idxMap.put(s1[i], i);
		}

		List<Integer> partitions = new ArrayList<>();
		int i = 0;
		int start = 0;
		int max = 0;
		while (i < s1.length) {
			max = Math.max(max, idxMap.get(s1[i]));
			if (i == max) {
				partitions.add(i - start + 1);
				start = i + 1;
			}
			i++;
		}

		return partitions;
	}

}