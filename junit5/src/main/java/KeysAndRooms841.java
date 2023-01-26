import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KeysAndRooms841 {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		Queue<Integer> frontier = new LinkedList<>();
		int n = rooms.size();
		Set<Integer> visited = new HashSet<>();
		frontier.offer(0);

		while (!frontier.isEmpty()) {
			int e = frontier.poll();
			if (visited.contains(e))
				continue;

			visited.add(e);
			frontier.addAll(rooms.get(e));
		}

		return visited.size() == n;
	}
}
