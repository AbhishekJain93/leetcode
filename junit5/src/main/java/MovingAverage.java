import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
	Queue<Integer> q = new LinkedList<>();
	int capacity = 0;
	int currentSum = 0;

	public MovingAverage(int size) {
		capacity = size;
	}

	public double next(int val) {
		if (q.size() >= this.capacity) {
			currentSum -= q.poll();
		}

		currentSum += val;
		q.offer(val);

		return (double) currentSum / q.size();
	}
}
