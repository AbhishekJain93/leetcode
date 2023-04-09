import java.util.ArrayDeque;
import java.util.Deque;

public class SubarrayMin907 {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int[] prevSmaller = new int[arr.length];
        int[] nextSmaller = new int[arr.length];
        long total = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                prevSmaller[stack.pop()] = i;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            prevSmaller[stack.pop()] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                nextSmaller[stack.pop()] = i;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nextSmaller[stack.pop()] = arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            total += 1l * ((i - prevSmaller[i]) * (nextSmaller[i] - i)) * arr[i];
        }

        return (int) (total % MOD);
    }
}
