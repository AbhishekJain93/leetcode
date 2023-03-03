import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMax239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<ValIndex> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        for (int j = 0; j < k; j++) {
            while (!dq.isEmpty() && dq.peekLast().val <= nums[j])
                dq.pollLast();

            dq.addLast(new ValIndex(nums[j], j));
        }

        for (int j = k; j < nums.length; j++) {
            res.add(dq.peekFirst().val);

            while (!dq.isEmpty() && dq.peekFirst().idx < j - k + 1) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && dq.peekLast().val <= nums[j]) {
                dq.pollLast();
            }

            dq.addLast(new ValIndex(nums[j], j));
        }

        res.add(dq.peekFirst().val); // max of last window

        return res.stream().mapToInt(i -> i).toArray();
    }
}

class ValIndex {
    public int val;
    public int idx;

    public ValIndex(int a, int b) {
        val = a;
        idx = b;
    }
}
