import java.util.Stack;

// O(1) if we use pointers and compare from the end
public class backspaceAndCompare844 {

    public static void main(String[] args) {
        System.out.println(new backspaceAndCompare844().backspaceCompare("y#fo##f", "y#f#o##f"));
    }

    public boolean backspaceCompare(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Stack<Character> q1 = new Stack<>();
        Stack<Character> q2 = new Stack<>();

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '#' && !q1.isEmpty())
                q1.pop();
            else if (s1[i] == '#')
                continue;
            else
                q1.push(s1[i]);
        }

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] == '#' && !q2.isEmpty())
                q2.pop();
            else if (t1[i] == '#')
                continue;
            else
                q2.push(t1[i]);
        }

        return q1.equals(q2);
    }
}
