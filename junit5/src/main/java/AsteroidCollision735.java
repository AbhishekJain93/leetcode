import java.util.Stack;

public class AsteroidCollision735 {
	public int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < asteroids.length; i++) {
			if (asteroids[i] > 0) {
				stack.push(asteroids[i]);
			} else {
				while (!stack.isEmpty() && stack.peek() < Math.abs(asteroids[i]) && stack.peek() > 0) {
					stack.pop();
				}
				if (stack.empty() || stack.peek() < 0) {
					stack.push(asteroids[i]);
					continue;
				}
				if (stack.peek() == Math.abs(asteroids[i])) {
					stack.pop();
					continue;
				}
			}
		}

		return stack.stream().mapToInt(i -> i).toArray();
	}
}
