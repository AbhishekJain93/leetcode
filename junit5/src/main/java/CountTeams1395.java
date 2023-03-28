public class CountTeams1395 {
    public int numTeams(int[] rating) {
        int total = 0;
        for (int j = 1; j < rating.length - 1; j++) {
            int smallLeft = 0, bigLeft = 0, smallRight = 0, bigRight = 0;

            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j])
                    smallLeft++;
                else if (rating[i] > rating[j])
                    bigLeft++;
            }

            for (int k = j + 1; k < rating.length; k++) {
                if (rating[k] < rating[j])
                    smallRight++;
                else if (rating[k] > rating[j])
                    bigRight++;
            }
            total += smallLeft * bigRight + bigLeft * smallRight;
        }

        return total;
    }
}
