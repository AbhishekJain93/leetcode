import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class FrequencySort {
	public String frequencySort(String s) {
		char[] s1 = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length; i++) {
			map.put(s1[i], map.getOrDefault(s1[i], 0) + 1);
		}

		PriorityQueue<CharacterFrequency> heap = new PriorityQueue<CharacterFrequency>(
				(CharacterFrequency c1, CharacterFrequency c2) -> Integer.compare(c2.count, c1.count));

		for (Entry<Character, Integer> e : map.entrySet()) {
			heap.offer(new CharacterFrequency(e.getKey(), e.getValue()));
		}

		StringBuilder sb = new StringBuilder();
		while (!heap.isEmpty()) {
			CharacterFrequency cf = heap.poll();

			while (cf.count > 0) {
				sb.append(cf.c);
				cf.count--;
			}

		}

		return sb.toString();
	}
}

class CharacterFrequency {
	char c;
	int count;

	public CharacterFrequency(char a, int b) {
		c = a;
		count = b;
	}
}
