import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
	// 0,3,7,2,5,8,4,6,0,1
	public int longestConsecutive(int[] nums) {
		Map<Integer, Integer> maxRange = new HashMap<>();

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (maxRange.containsKey(nums[i])) {
				continue;
			}

			int left = 0, right = 0;
			if (maxRange.containsKey(nums[i] - 1)) {
				left = maxRange.get(nums[i] - 1);
			}
			if (maxRange.containsKey(nums[i] + 1)) {
				right = maxRange.get(nums[i] + 1);
			}

			maxRange.put(nums[i], 1 + left + right);

			// instead of putting increased range for all, just update the ends because new
			// elements will only come in ends
			// for (int j = 1; maxRange.containsKey(nums[i] - j); j++) {
			// maxRange.put(nums[i] - j, left + 1 + right);
			// }
			// for (int j = 1; maxRange.containsKey(nums[i] + j); j++) {
			// maxRange.put(nums[i] + j, left + 1 + right);
			// }

			maxRange.put(nums[i] - left, left + 1 + right);
			maxRange.put(nums[i] + right, left + 1 + right);

			max = Math.max(max, 1 + left + right);
		}

		return max;
	}

	public int longestConsecutive2(int[] nums) {
		Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());

		int max = 0;
		for (Integer num : set) {
			int left = 0, right = 0;
			while (set.contains(num - left - 1))
				left++;

			while (set.contains(num + right + 1))
				right++;

			max = Math.max(max, left + right + 1);
		}

		return max;
	}

}
