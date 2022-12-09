import java.util.Stack;

public class StackWithIncrement {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	int size;

	public StackWithIncrement(int maxSize) {

		this.size = maxSize;
	}

	public void push(int x) {
		if (s1.size() < size) {
			s1.push(x);
		}
	}

	public int pop() {
		if (s1.isEmpty())
			return -1;

		return s1.pop();

	}

	public void increment(int k, int val) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		while (!s2.isEmpty()) {
			if (k > 0) {
				s1.push(s2.pop() + val);
				k--;
			} else {
				s1.push(s2.pop());
			}
		}
	}

}
