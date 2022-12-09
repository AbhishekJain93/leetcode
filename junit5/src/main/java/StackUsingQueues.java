import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> pushQ = new LinkedList<>();
	Queue<Integer> popQ = new LinkedList<>();

	public StackUsingQueues() {

	}

	public void push(int x) {
		pushQ.add(x);
	}

	public int pop() {
		int size = pushQ.size();
		for (int i = 0; i < size - 1; i++) {
			popQ.offer(pushQ.poll());
		}
		int returnVal = pushQ.poll();
		pushQ = popQ;
		popQ = new LinkedList<>();
		return returnVal;
	}

	public int top() {
		int size = pushQ.size();
		for (int i = 0; i < size - 1; i++) {
			popQ.offer(pushQ.poll());
		}
		int returnVal = pushQ.poll();
		popQ.offer(returnVal);
		pushQ = popQ;
		popQ = new LinkedList<>();
		return returnVal;
	}

	public boolean empty() {
		return pushQ.isEmpty();
	}
}
