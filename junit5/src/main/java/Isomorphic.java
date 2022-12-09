import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(new Isomorphic().isisomorphic("paper", "title"));
    }

    public boolean isisomorphic(String s, String t) {
        return this.isoHelper(s, t) && this.isoHelper(t, s);
    }

    public boolean isoHelper(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        char[] converted = new char[s1.length];
        Map<Character, Character> lookup = new HashMap<Character, Character>();

        for (int i = 0; i < converted.length; i++) {
            if (lookup.containsKey(s1[i])) {
                if (lookup.get(s1[i]) != t1[i])
                    return false;
                converted[i] = lookup.get(s1[i]);
            } else {
                lookup.put(s1[i], t1[i]);
                converted[i] = t1[i];
            }
        }

        return Arrays.equals(t1, converted);
    }

}
