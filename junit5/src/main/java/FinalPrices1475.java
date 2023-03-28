import java.util.Stack;

public class FinalPrices1475 {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                res[idx] = prices[idx] - prices[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            res[idx] = prices[idx];
        }

        return res;
    }
}
