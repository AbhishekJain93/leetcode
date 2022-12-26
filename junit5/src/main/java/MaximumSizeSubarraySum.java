import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarraySum {
	public int maxSubArrayLen(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			map.put(sum, i);
		}

		int maxLen = map.containsKey(k) ? map.get(k) + 1 : 0;

		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (!map.containsKey(sum + k))
				continue;
			int idx = map.get(sum + k);
			if (idx > i)
				maxLen = Math.max(maxLen, idx - i);

		}

		return maxLen;
	}
}
