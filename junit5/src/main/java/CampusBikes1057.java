import java.util.Arrays;
import java.util.PriorityQueue;

public class CampusBikes1057 {
	public int[] assignBikes(int[][] workers, int[][] bikes) {
		PriorityQueue<TripletX> heap = new PriorityQueue<>(
				(TripletX a, TripletX b) -> {
					if (a.z != b.z)
						return a.z - b.z;
					else if (a.y != b.y)
						return a.y - b.y;
					else
						return a.x - b.x;
				});

		for (int i = 0; i < workers.length; i++) {
			for (int j = 0; j < bikes.length; j++) {
				heap.offer(new TripletX(j, i,
						Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1])));
			}

		}

		boolean[] bikeUsed = new boolean[bikes.length];
		int[] workerAssigned = new int[workers.length];
		Arrays.fill(workerAssigned, -1);

		int assigned = 0;
		while (!heap.isEmpty() && assigned < workers.length) {
			TripletX poll = heap.poll();
			if (!bikeUsed[poll.x] && workerAssigned[poll.y] == -1) {
				workerAssigned[poll.y] = poll.x;
				assigned++;
				bikeUsed[poll.x] = true;
			}
		}

		return workerAssigned;
	}
}

class TripletX {
	public int x;
	public int y;
	public int z;

	public TripletX(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}
}
