import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountWords2135 {
    public int wordCount(String[] startWords, String[] targetWords) {
        Set<String> startWordSet = new HashSet<>();

        for (String word : startWords) {
            char[] w1 = word.toCharArray();
            Arrays.sort(w1);
            startWordSet.add(String.valueOf(w1));
        }

        int count = 0;
        for (String target : targetWords) {
            char[] t1 = target.toCharArray();
            Arrays.sort(t1);
            String targetSorted = String.valueOf(t1);
            for (int i = 0; i < t1.length; i++) {
                String prefix = targetSorted.substring(0, i);
                String suffix = targetSorted.substring(i + 1, t1.length);

                if (startWordSet.contains(prefix + suffix)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
