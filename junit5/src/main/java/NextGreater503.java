import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreater503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.remove()] = nums[i];
            }

            stack.push(i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i >= stack.peek())
                break;

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i] && i < stack.peek()) {
                res[stack.remove()] = nums[i];
            }

        }

        while (!stack.isEmpty()) {
            res[stack.remove()] = -1;
        }

        return res;
    }
}
