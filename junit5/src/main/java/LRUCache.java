import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {

	int capacity;
	Map<Integer, Integer> map = new HashMap<>();
	List<Integer> order = new LinkedList<>();

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			int val = map.get(key);
			order.remove(Integer.valueOf(key));
			order.add(0, key);
			return val;
		} else
			return -1;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, value);
			order.remove(Integer.valueOf(key));
			order.add(0, key);
		} else {
			if (map.size() < capacity) {
				map.put(key, value);
				order.add(0, key);
			} else {
				int last = order.get(order.size() - 1);
				map.remove(last);
				order.remove(order.size() - 1);
				map.put(key, value);
				order.add(0, key);
			}
		}
	}
}
