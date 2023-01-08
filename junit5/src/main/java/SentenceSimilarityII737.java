import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentenceSimilarityII737 {
	public boolean areSentencesSimilarTwo(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
		if (sentence1.length != sentence2.length)
			return false;

		DisjointSetString disjoint = new DisjointSetString();
		for (List<String> list : similarPairs) {
			disjoint.addPair(list.get(0), list.get(1));
		}

		for (int i = 0; i < sentence1.length; i++) {
			if (sentence1[i].equals(sentence2[i]))
				continue;

			if (disjoint.findSet(sentence1[i]).equals(disjoint.findSet(sentence2[i])))
				continue;

			return false;
		}

		return true;
	}
}

class DisjointSetString {

	Map<String, String> parent = new HashMap<>();
	Map<String, Integer> size = new HashMap<>();

	public String findSet(String a) {

		if (parent.getOrDefault(a, a).equals(a))
			return a;

		String par = findSet(parent.get(a));
		parent.put(a, par);
		return par;
	}

	public int union(String a, String b) {
		String parA = findSet(a);
		String parB = findSet(b);
		if (parA.equals(parB))
			return size.get(parA);

		if (size.get(parA) >= size.get(parB)) {
			parent.put(parB, parA);
			size.put(parA, size.get(parA) + size.get(parB));
			return size.get(parA);
		} else {
			parent.put(parA, parB);
			size.put(parB, size.get(parB) + size.get(parA));
			return size.get(parB);
		}
	}

	public void addPair(String a, String b) {
		String parA = parent.get(a);
		String parB = parent.get(b);

		if (parA == null) {
			parent.put(a, a);
			size.put(a, 1);
		}

		if (parB == null) {
			parent.put(b, b);
			size.put(b, 1);
		}

		union(a, b);
	}
}
