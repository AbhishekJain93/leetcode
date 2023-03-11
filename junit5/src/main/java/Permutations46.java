import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0)
            return List.of();

        return helper(nums, 0);
    }

    private List<List<Integer>> helper(int[] nums, int idx) {
        List<List<Integer>> res = new ArrayList<>();
        if (idx == nums.length - 1) {
            List<Integer> l = new ArrayList<>();
            l.add(nums[idx]);
            res.add(l);
            return res;
        }

        List<List<Integer>> perm = helper(nums, idx + 1);

        for (int i = 0; i < perm.size(); i++) {
            List<Integer> p = perm.get(i);
            for (int j = 0; j <= p.size(); j++) {
                List<Integer> newP = new ArrayList<>(p);
                newP.add(j, nums[idx]);
                res.add(newP);
            }
        }

        return res;
    }
}
