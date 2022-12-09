import java.util.HashMap;
import java.util.Map;

public class HouseRobber {

	public int rob(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		return robHelper(nums, 0, map);
	}

	public int robHelper(int[] nums, int idx, Map<Integer, Integer> map) {
		if (map.containsKey(idx))
			return map.get(idx);

		if (idx == nums.length - 1)
			return nums[nums.length - 1];
		if (idx == nums.length - 2)
			return Math.max(nums[nums.length - 2], nums[nums.length - 1]);

		int result = Math.max(nums[idx] + robHelper(nums, idx + 2, map), robHelper(nums, idx + 1, map));
		map.put(idx, result);
		return result;
	}
}
