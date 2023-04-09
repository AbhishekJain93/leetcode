import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangle84 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;

        int[] prevSmaller = new int[heights.length];
        int[] nextSmaller = new int[heights.length];

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                prevSmaller[stack.pop()] = i;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            prevSmaller[stack.pop()] = -1;
        }

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                nextSmaller[stack.pop()] = i;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nextSmaller[stack.pop()] = heights.length;
        }

        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (nextSmaller[i] - prevSmaller[i] - 1));
        }

        return max;
    }
}
