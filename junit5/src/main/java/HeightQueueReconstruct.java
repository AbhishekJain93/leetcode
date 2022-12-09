import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeightQueueReconstruct {
	public int[][] reconstructQueue(int[][] people) {
		int[][] result = new int[people.length][2];

		PriorityQueue<int[]> heap = new PriorityQueue<>(
				(int[] a, int[] b) -> {
					if (a[0] == b[0])
						return Integer.compare(a[1], b[1]);
					else
						return Integer.compare(b[0], a[0]); // descending order of heights
				});

		for (int i = 0; i < people.length; i++) {
			heap.offer(people[i]);
		}

		List<int[]> resultList = new ArrayList<>();
		while (!heap.isEmpty()) {
			int[] person = heap.poll();
			int idx = person[1]; // starts with 0 so no need for +1

			resultList.add(idx, person);

		}

		return resultList.toArray(result);
	}
}
