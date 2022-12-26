public class TeemoAttack {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		int total = 0, currentStart = 0, currentEnd = -1;

		for (int i = 0; i < timeSeries.length; i++) {
			if (currentEnd < timeSeries[i]) {
				total += currentEnd - currentStart + 1;
				currentStart = timeSeries[i];
				currentEnd = timeSeries[i] + duration - 1;
			} else {
				currentEnd = timeSeries[i] + duration - 1;
			}
		}
		total += currentEnd - currentStart + 1;

		return total;
	}
}
