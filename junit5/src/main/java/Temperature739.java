import java.util.Deque;
import java.util.LinkedList;

public class Temperature739 {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0)
            return null;

        int[] res = new int[temperatures.length];

        Deque<IdxPair> stack = new LinkedList<IdxPair>();
        stack.push(new IdxPair(temperatures[0], 0));

        for (int i = 1; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().val) {
                IdxPair pop = stack.pop();
                res[pop.idx] = i - pop.idx;
            }

            stack.push(new IdxPair(temperatures[i], i));
        }

        while (!stack.isEmpty()) {
            res[stack.pop().idx] = 0;
        }

        return res;
    }
}

class IdxPair {
    int val;
    int idx;

    public IdxPair(int a, int b) {
        val = a;
        idx = b;
    }
}
