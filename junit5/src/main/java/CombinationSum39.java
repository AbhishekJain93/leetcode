import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> current = new ArrayList<>();

		Arrays.sort(candidates); // sorting is only needed to help short circut for loop if target -
									// candidates[i] < 0
									// else we dont need since elements are distinct in array
		combinationSumHelper(candidates, target, 0, current, res);

		return res;
	}

	// 2 3 6 7
	private void combinationSumHelper(int[] candidates, int target, int idx, List<Integer> current,
			List<List<Integer>> res) {

		if (target == 0) {
			res.add(new ArrayList<>(current));
			return;
		}

		if (target < 0)
			return;

		// we avoid looping over previous elements to avoid same result list like
		// 2,2,2,3 and 2,2,3,2
		for (int i = idx; i < candidates.length; i++) {
			if (target - candidates[i] < 0)
				return;
			current.add(candidates[i]);
			combinationSumHelper(candidates, target - candidates[i], i, current, res);
			current.remove(current.size() - 1);
		}
	}
}
