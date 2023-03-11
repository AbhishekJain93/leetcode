import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            freq.put(nums1[i], freq.getOrDefault(nums1[i], 0) + 1);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!freq.containsKey(nums2[j]) || freq.get(nums2[j]) == 0)
                continue;
            else {
                res.add(nums2[j]);
                freq.put(nums2[j], freq.get(nums2[j]) - 1);
            }
        }

        return res.stream().mapToInt(i -> (int) i).toArray();
    }
}
