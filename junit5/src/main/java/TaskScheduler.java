import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < tasks.length; i++) {
			map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
		}

		PriorityQueue<CharFrequecy> heap = new PriorityQueue<>(
				(CharFrequecy f1, CharFrequecy f2) -> Integer.compare(f2.frequency, f1.frequency));
		for (Entry<Character, Integer> e : map.entrySet()) {
			heap.offer(new CharFrequecy(e.getKey(), e.getValue()));
		}

		Map<Integer, CharFrequecy> waitQ = new HashMap<>();
		int time = 0;

		while (!heap.isEmpty() || !waitQ.isEmpty()) {
			if (waitQ.containsKey(time - n - 1)) {
				heap.offer(waitQ.get(time - n - 1));
				waitQ.remove(time - n - 1);
			}

			if (!heap.isEmpty()) {
				CharFrequecy ch = heap.poll();
				ch.frequency -= 1;
				if (ch.frequency > 0)
					waitQ.put(time, ch);
			}
			time++;
		}

		return time;
	}
}

class CharFrequecy {
	char c;
	int frequency;

	public CharFrequecy(Character ch, int f) {
		c = ch;
		frequency = f;
	}
}
