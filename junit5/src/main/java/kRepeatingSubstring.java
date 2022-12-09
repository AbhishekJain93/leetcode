
public class kRepeatingSubstring {

    public static void main(String[] args) {

        System.out.println(new kRepeatingSubstring().maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }

    public int maxRepeating(String sequence, String word) {

        int k = 0;
        String w = word;

        while (sequence.contains(w)) {
            k += 1;
            w = w + word;
        }

        return k;
    }

    // aaabaaaabaaabaaaabaaaabaaaabaaaaba
    // aaaba

    public int maxRepeating2(String sequence, String word) {
        int repeating = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            repeating++;
            sb.append(word);
        }
        return repeating;
    }
}
