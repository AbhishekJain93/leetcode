import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValue981 {
	Map<String, List<SPair>> m = new HashMap<>();

	public TimeBasedKeyValue981() {

	}

	public void set(String key, String value, int timestamp) {
		m.putIfAbsent(key, new ArrayList<SPair>());
		m.get(key).add(new SPair(timestamp, value));
	}

	public String get(String key, int timestamp) {

		List<SPair> l = m.getOrDefault(key, null);
		if (l == null)
			return "";

		return findWithMaxTimestamp(l, timestamp, 0, l.size() - 1);
	}

	private String findWithMaxTimestamp(List<SPair> l, int timestamp, int start, int end) {
		if (start == end)
			return l.get(start).x > timestamp ? "" : l.get(start).y;

		else if (end - start == 1) {

			if (l.get(start).x > timestamp)
				return "";

			if (l.get(end).x <= timestamp)
				return l.get(end).y;

			return l.get(start).y;
		}

		int mid = start + (end - start) / 2;
		int ts = l.get(mid).x;

		if (ts == timestamp)
			return l.get(mid).y;

		else if (ts < timestamp)
			return findWithMaxTimestamp(l, timestamp, mid, end);

		else
			return findWithMaxTimestamp(l, timestamp, start, mid - 1);
	}
}

class SPair {
	int x;
	String y;

	public SPair(int a, String b) {
		x = a;
		y = b;
	}
}
