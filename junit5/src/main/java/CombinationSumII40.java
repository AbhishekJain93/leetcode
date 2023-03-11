import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();

        helper(candidates, target, 0, 0, new ArrayList<Integer>(), res);

        return res.stream().toList();
    }

    private void helper(int[] candidates, int target, int currentSum, int idx, ArrayList<Integer> path,
            Set<List<Integer>> res) {
        if (currentSum > target || (idx >= candidates.length && currentSum != target))
            return;

        if (currentSum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        if (currentSum + candidates[idx] > target)
            return;

        path.add(candidates[idx]);
        helper(candidates, target, currentSum + candidates[idx], idx + 1, path, res);
        path.remove(path.size() - 1);
        int i = idx;
        while (i < candidates.length && candidates[i] == candidates[idx]) {
            i++;
        } // above we are doing this to avoid redundant same
          // element add as we have already include the
          // case where we included the same element

        helper(candidates, target, currentSum, i, path, res);
    }
}
