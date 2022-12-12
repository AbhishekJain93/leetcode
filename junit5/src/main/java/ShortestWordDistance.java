
class ShortestWordDistance {
	public int shortestDistance(String[] wordsDict, String word1, String word2) {
		int i = 0;
		int minDistance = Integer.MAX_VALUE;
		for (i = 0; i < wordsDict.length; i++) {
			if (!wordsDict[i].equals(word1))
				continue;

			int j = i - 1;
			while (j >= 0) {
				if (wordsDict[j].equals(word2)) {
					minDistance = Math.min(minDistance, i - j);
					break;
				}
				j--;
			}

			j = i + 1;
			while (j < wordsDict.length) {
				if (wordsDict[j].equals(word2)) {
					minDistance = Math.min(minDistance, j - i);
					break;
				}
				j++;
			}
		}

		return minDistance;
	}

	public int shortestDistance2(String[] wordsDict, String word1, String word2) {
		int i = 0, p1 = wordsDict.length, p2 = wordsDict.length;
		int minDistance = Integer.MAX_VALUE;
		for (i = 0; i < wordsDict.length; i++) {
			if (wordsDict[i].equals(word1)) {
				p1 = i;
				minDistance = Math.min(minDistance, Math.abs(p1 - p2));
			} else if (wordsDict[i].equals(word2)) {
				p2 = i;
				minDistance = Math.min(minDistance, Math.abs(p2 - p1));
			}
		}

		return minDistance;
	}
}