import java.util.HashMap;
import java.util.Map;

public class CountingElements1426 {
	public int countElements(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}

		int count = 0;
		for (java.util.Map.Entry<Integer, Integer> e : freq.entrySet()) {
			if (freq.containsKey(e.getKey() + 1))
				count += e.getValue();
		}

		return count;
	}

}
