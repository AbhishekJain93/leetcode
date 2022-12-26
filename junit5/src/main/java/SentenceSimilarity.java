import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class SentenceSimilarity {
	public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
		if (sentence1.length != sentence2.length)
			return false;

		Map<String, Set<String>> map = new HashMap<>();
		for (List<String> list : similarPairs) {

			map.putIfAbsent(list.get(0), new HashSet<>());
			map.putIfAbsent(list.get(1), new HashSet<>());
			map.get(list.get(0)).add(list.get(1));
			map.get(list.get(1)).add(list.get(0));

		}

		for (int i = 0; i < sentence1.length; i++) {
			if (sentence1[i].equals(sentence2[i]))
				continue;

			if (map.getOrDefault(sentence1[i], new HashSet<>()).contains(sentence2[i]))
				continue;

			// if (map.getOrDefault(sentence2[i], new HashSet<>()).contains(sentence1[i]))
			// continue; not needed to check as we put a->b and b->a in hashmap

			return false;
		}

		return true;
	}
}