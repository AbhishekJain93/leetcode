import java.util.HashMap;
import java.util.Map;

public class JumpGame {
	public boolean canJump(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		map.put(nums.length - 1, true);

		return canJumpHelper(nums, 0, map);
	}

	public boolean canJumpHelper(int[] nums, int idx, Map<Integer, Boolean> map) {
		if (map.containsKey(idx))
			return map.get(idx);

		for (int i = 1; i <= nums[idx]; i++) {
			if (canJumpHelper(nums, idx + i, map)) {
				map.put(idx, true);
				return true;
			}
		}

		map.put(idx, false);
		return false;
	}

	public boolean canJump2(int[] nums) {
		int nearestTrue = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] >= nearestTrue - i)
				nearestTrue = i;
		}

		return nearestTrue == 0;
	}
}
