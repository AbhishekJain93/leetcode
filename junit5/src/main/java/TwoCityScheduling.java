import java.util.PriorityQueue;

public class TwoCityScheduling {
	public int twoCitySchedCost(int[][] costs) {
		PriorityQueue<int[]> heap = new PriorityQueue<>(
				(int[] a1, int[] a2) -> Integer.compare(a1[0] - a1[1], a2[0] - a2[1]));

		for (int i = 0; i < costs.length; i++) {
			heap.offer(costs[i]);
		}

		int totalCost = 0;
		for (int i = 0; i < costs.length / 2; i++) {
			totalCost += heap.poll()[0];
		}

		for (int i = 0; i < costs.length / 2; i++) {
			totalCost += heap.poll()[1];
		}

		return totalCost;
	}
}
