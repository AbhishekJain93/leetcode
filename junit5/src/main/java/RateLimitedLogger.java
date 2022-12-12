import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RateLimitedLogger {
	Set<String> set = new HashSet<>();
	Queue<Log> q = new LinkedList<>();

	public RateLimitedLogger() {

	}

	public boolean shouldPrintMessage(int timestamp, String message) {
		while (!q.isEmpty() && timestamp >= q.peek().timestamp + 10) {
			String msg = q.poll().msg;
			set.remove(msg);
		}

		if (set.contains(message))
			return false;

		q.offer(new Log(message, timestamp));
		set.add(message);

		return true;
	}
}

class Log {
	String msg;
	int timestamp;

	public Log(String x, int t) {
		msg = x;
		timestamp = t;
	}
}
