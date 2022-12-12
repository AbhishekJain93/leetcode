import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HighFive {
	public int[][] highFive(int[][] items) {
		PriorityQueue<int[]> heap = new PriorityQueue<>(
				(int[] s1, int[] s2) -> {
					if (s1[0] == s2[0])
						return Integer.compare(s2[1], s1[1]);

					return Integer.compare(s1[0], s2[0]);
				});

		for (int[] is : items) {
			heap.offer(is);
		}

		List<int[]> resultList = new ArrayList<>();
		int[][] result = new int[resultList.size()][2];
		while (!heap.isEmpty()) {
			int current = heap.peek()[0];

			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += heap.poll()[1];
			}
			resultList.add(new int[] { current, sum / 5 });
			while (!heap.isEmpty() && heap.peek()[0] == current)
				heap.poll();

		}

		return resultList.toArray(result);
	}
}
