import java.util.PriorityQueue;

public class RottenApples {
	public int eatenApples(int[] apples, int[] days) {
		PriorityQueue<AppleDays> p = new PriorityQueue<>((AppleDays t1, AppleDays t2) -> Integer.compare(t1.y, t2.y));

		int eaten = 0;
		int i = 0;
		for (i = 0; i < days.length; i++) {
			p.add(new AppleDays(apples[i], i + days[i]));
			while (!p.isEmpty() && p.peek().y <= i) {
				p.poll();
			}

			if (!p.isEmpty()) {
				AppleDays t = p.poll();
				eaten++;
				if (t.x > 1) {
					p.add(new AppleDays(t.x - 1, t.y));
				}
			}
		}

		while (!p.isEmpty()) {
			while (!p.isEmpty() && p.peek().y <= i) {
				p.poll();
			}

			if (!p.isEmpty()) {
				AppleDays t = p.poll();
				eaten++;
				if (t.x > 1) {
					p.add(new AppleDays(t.x - 1, t.y));
				}
			}
			i++;
		}

		return eaten;
	}

	class AppleDays {
		public AppleDays(int i, int y2) {
			x = i;
			y = y2;
		}

		int x;
		int y;
	}
}
