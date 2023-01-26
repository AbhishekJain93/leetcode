import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate649 {
	public String predictPartyVictory(String senate) {
		char[] senate1 = senate.toCharArray();

		Queue<Integer> qR = new LinkedList<>();
		Queue<Integer> qD = new LinkedList<>();

		for (int i = 0; i < senate1.length; i++) {
			if (senate1[i] == 'R')
				qR.offer(i);
			else
				qD.offer(i);
		}

		while (!qR.isEmpty() && !qD.isEmpty()) {
			int idxR = qR.poll();
			int idxD = qD.poll();

			if (idxR < idxD)
				qR.offer(idxR + senate1.length);
			else
				qD.offer(idxD + senate1.length);
		}

		return qD.isEmpty() ? "Radiant" : "Dire";
	}
}
