import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer n1, Integer n2) -> n2 - n1);
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public MedianFinder() {

	}

	public void addNum(int num) {
		if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
			maxHeap.offer(num);
		} else {
			minHeap.offer(num);
		}
		rebalance();
	}

	private void rebalance() {
		if (maxHeap.size() - minHeap.size() > 1) {
			minHeap.offer(maxHeap.poll());
		} else if (minHeap.size() - maxHeap.size() > 1) {
			maxHeap.offer(minHeap.poll());
		}
	}

	public double findMedian() {
		if (maxHeap.size() == minHeap.size())
			return (maxHeap.peek() + minHeap.peek()) / 2.0d;
		else if (maxHeap.size() > minHeap.size())
			return maxHeap.peek();
		else
			return minHeap.peek();
	}
}
