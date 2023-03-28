import java.util.Stack;

public class StockSpanner901 {
    Stack<Pair> stack = new Stack<>();
    int idx = 0;

    public StockSpanner901() {

    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek().x <= price) {
            stack.pop();
        }

        int lowerIdx = stack.empty() ? -1 : stack.peek().y;
        stack.push(new Pair(price, idx));
        int returnVal = idx - lowerIdx;
        idx++;
        return returnVal;
    }
}
