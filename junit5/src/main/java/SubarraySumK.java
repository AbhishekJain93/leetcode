import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {

	public int subarraySum(int[] nums, int k) {
		Map<Integer, Integer> prefixSumMap = new HashMap<>();
		prefixSumMap.put(0, 1);

		int currrentSum = 0, total = 0;
		for (int i = 0; i < nums.length; i++) {
			currrentSum += nums[i];
			if (prefixSumMap.containsKey(currrentSum - k)) {
				total += prefixSumMap.get(currrentSum - k);
			}

			prefixSumMap.put(currrentSum, prefixSumMap.getOrDefault(currrentSum, 0) + 1);
		}

		return total;
	}
}
