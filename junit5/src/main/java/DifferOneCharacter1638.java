
public class DifferOneCharacter1638 {
    public int countSubstrings(String s, String t) {
        // dp[i][j][0] == number of substrings ending at i & j with 0 character diffs
        // dp[i][j][1] == number of substrings ending at i & j with 1 character diffs
        int[][][] dp = new int[s.length()][t.length()][2];
        int total = 0;

        for (int i = 0; i < t.length(); i++) {
            dp[0][i][0] = s.charAt(0) == t.charAt(i) ? 1 : 0;
            dp[0][i][1] = (dp[0][i][0] + 1) % 2;
            total += dp[0][i][1];
        }

        for (int i = 1; i < s.length(); i++) { // this starts with 1 not 0 as [0,0] already covered in earlier loop and
                                               // we don't want to double count
            dp[i][0][0] = s.charAt(i) == t.charAt(0) ? 1 : 0;
            dp[i][0][1] = (dp[i][0][0] + 1) % 2;
            total += dp[i][0][1];
        }

        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j][0] = dp[i - 1][j - 1][0] + 1; // +1 for single character substring s[i:i] and t[j:j]
                    dp[i][j][1] = dp[i - 1][j - 1][1];
                } else {
                    dp[i][j][0] = 0; // character at i & j is different so no substring ending at i & j can have 0
                                     // diffs
                    dp[i][j][1] = dp[i - 1][j - 1][0] + 1;
                }

                total += dp[i][j][1];
            }
        }

        return total;
    }

}
