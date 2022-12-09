import java.util.PriorityQueue;

public class RottenApples {
	public int eatenApples(int[] apples, int[] days) {
		PriorityQueue<Tuple> p = new PriorityQueue<>((Tuple t1, Tuple t2) -> Integer.compare(t1.y, t2.y));

		int eaten = 0;
		int i = 0;
		for (i = 0; i < days.length; i++) {
			p.add(new Tuple(apples[i], i + days[i]));
			while (!p.isEmpty() && p.peek().y <= i) {
				p.poll();
			}

			if (!p.isEmpty()) {
				Tuple t = p.poll();
				eaten++;
				if (t.x > 1) {
					p.add(new Tuple(t.x - 1, t.y));
				}
			}
		}

		while (!p.isEmpty()) {
			while (!p.isEmpty() && p.peek().y <= i) {
				p.poll();
			}

			if (!p.isEmpty()) {
				Tuple t = p.poll();
				eaten++;
				if (t.x > 1) {
					p.add(new Tuple(t.x - 1, t.y));
				}
			}
			i++;
		}

		return eaten;
	}
}

class Tuple {
	int x;
	int y;

	public Tuple(int a, int b) {
		x = a;
		y = b;
	}
}
