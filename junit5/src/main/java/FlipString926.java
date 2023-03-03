import java.util.HashMap;

public class FlipString926 {

    public int minFlipsMonoIncr(String s) {
        HashMap<String, Integer> dp = new HashMap<>();
        int min = flipH(s.toCharArray(), 0, '0', dp);

        return min;
    }

    private int flipH(char[] charArray, int i, char prev, HashMap<String, Integer> dp) {
        System.out.printf(" entering i = %d, prev = %c \n", i, prev);
        if (i == charArray.length)
            return 0;

        if (dp.containsKey(i + ":" + prev)) {
            System.out.printf(" cached i = %d, prev = %c, val=%d \n", i, prev, dp.get("i" + ":" + prev));
            return dp.get(i + ":" + prev);
        }

        int ret = Integer.MAX_VALUE;
        if (prev == '0') {
            if (charArray[i] == '0') {
                ret = Math.min(flipH(charArray, i + 1, '0', dp), 1 + flipH(charArray, i + 1, '1', dp));
            } else {
                ret = Math.min(1 + flipH(charArray, i + 1, '0', dp), flipH(charArray, i + 1, '1', dp));
            }
        } else {
            if (charArray[i] == '0') {
                ret = 1 + flipH(charArray, i + 1, '1', dp);
            } else {
                ret = flipH(charArray, i + 1, '1', dp);
            }
        }

        dp.put(i + ":" + prev, ret);
        System.out.printf(" put: key: %s \n", (i + ":" + prev));
        System.out.printf(" i = %d, prev = %c, val = %d \n", i, prev, ret);
        return ret;
    }
}
