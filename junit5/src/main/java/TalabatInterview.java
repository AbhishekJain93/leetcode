public class TalabatInterview {
	public boolean canProcessLine(int[] people) {
		int twentyFiveChange = 0, fiftyChange = 0;

		for (int customerValue : people) {
			if (customerValue == 25) {
				twentyFiveChange++;
			} else if (customerValue == 50) {
				if (twentyFiveChange <= 0)
					return false;

				fiftyChange += 1;
				twentyFiveChange -= 1;
			} else { // assuming this would be 100 only, change returned would be 75 === (25 + 25
						// +25) || (50 + 25)

				if (twentyFiveChange > 0 && fiftyChange > 0) {
					twentyFiveChange -= 1;
					fiftyChange -= 1;
					continue;
				}

				if (twentyFiveChange > 2) { // atleast 3
					twentyFiveChange -= 3;
					continue;
				}

				return false;
			}
		}

		return true;
	}
}
