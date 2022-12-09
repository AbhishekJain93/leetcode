import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
	Map<Integer, Integer> valueIndex = new HashMap<>();
	List<Integer> list = new ArrayList<>();
	Random random = new Random();

	public RandomizedSet() {

	}

	public boolean insert(int val) {
		if (valueIndex.containsKey(val)) {
			return false;
		}

		list.add(val);
		valueIndex.put(val, list.size() - 1);
		return true;

	}

	public boolean remove(int val) {
		if (!valueIndex.containsKey(val))
			return false;

		int pos = valueIndex.get(val);
		valueIndex.remove(val);

		if (pos == list.size() - 1) {
			list.remove(list.size() - 1);
			return true;
		}

		int replacedVal = list.get(list.size() - 1);
		list.set(pos, replacedVal);
		valueIndex.put(replacedVal, pos);
		list.remove(list.size() - 1);
		return true;
	}

	public int getRandom() {
		return list.get(random.nextInt(list.size()));
	}
}
