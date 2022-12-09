import java.util.Stack;

public class MinStack {

	Stack<Tuple> stack = new Stack<>();

	public MinStack() {

	}

	public void push(int val) {
		if (stack.isEmpty()) {
			stack.push(new Tuple(val, val));
		} else {
			stack.push(new Tuple(val, Math.min(val, stack.peek().min)));
		}

	}

	public void pop() {
		stack.pop();
	}

	public int top() {

		return stack.peek().val;
	}

	public int getMin() {
		return stack.peek().min;
	}
}

class Tuple {
	int val;
	int min;

	public Tuple(int x, int y) {
		val = x;
		min = y;
	}
}
