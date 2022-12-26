import java.util.ArrayList;
import java.util.List;

//0, 1, 3, 50, 75
public class MissingRanges {
	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> result = new ArrayList<>();

		if (nums.length == 0) {
			return upper == lower ? List.of("" + lower) : List.of("" + lower + "->" + upper);
		}

		int l = nums[0];
		if (lower < l) {
			if (lower == l - 1)
				result.add("" + lower);
			else
				result.add("" + lower + "->" + (l - 1));
		}

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] > 2) {
				result.add("" + (nums[i] + 1) + "->" + (nums[i + 1] - 1));
			} else if (nums[i + 1] - nums[i] == 2) {
				result.add("" + (nums[i] + 1));
			}
		}

		int r = nums[nums.length - 1];
		if (r < upper) {
			if (r == upper - 1)
				result.add("" + upper);
			else
				result.add("" + (r + 1) + "->" + upper);
		}

		return result;
	}
}