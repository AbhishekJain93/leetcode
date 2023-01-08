import java.util.HashMap;
import java.util.Map;

public class MinimumRounds {
	public int minimumRounds(int[] tasks) {
		Map<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < tasks.length; i++) {
			freq.put(tasks[i], freq.getOrDefault(tasks[i], 0) + 1);
		}

		int count = 0;
		for (java.util.Map.Entry<Integer, Integer> e : freq.entrySet()) {
			int num = e.getValue();
			if (num == 1)
				return -1;

			if (num == 2 || num == 3) {
				count += 1;
				continue;
			}

			int q = num / 3;
			int rem = num % 3;
			count += (q + (rem == 0 ? 0 : 1));

		}

		return count;
	}
}
