import java.util.HashMap;
import java.util.Map;

//  2,3,1,1,4
public class JumpGameII {
	public int jump(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(nums.length - 1, 0);
		return jumpHelper(nums, 0, map);
	}

	private int jumpHelper(int[] nums, int idx, Map<Integer, Integer> map) {
		if (map.containsKey(idx))
			return map.get(idx);

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= nums[idx] && idx + i < nums.length; i++) {
			int val = jumpHelper(nums, idx + i, map);
			if (val < Integer.MAX_VALUE)
				min = Math.min(min, 1 + val);
		}

		map.put(idx, min);
		return min;
	}

	public int jump2(int[] nums) {
		int[] max = new int[nums.length];

		max[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (i > max[i - 1])
				return -1; // case where not possible to reach end
			max[i] = Math.max(max[i - 1], i + nums[i]);
		}

		int jumps = 0;
		int j = 0;
		while (j < nums.length - 1) {
			j = max[j];
			jumps++;
		}

		return jumps;
	}
}
