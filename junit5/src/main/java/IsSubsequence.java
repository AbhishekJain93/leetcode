import java.util.Stack;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        char[] sub = s.toCharArray();
        char[] t1 = t.toCharArray();
        int size = sub.length;

        if (sub.length == 0)
            return true;
        if (t1.length == 0)
            return false;
        Stack<Character> stack = new Stack<Character>();

        for (int i = size - 1; i >= 0; i--) {
            stack.push(sub[i]);
        }

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] == stack.peek())
                stack.pop();

            if (stack.isEmpty())
                return true;
        }

        return false;

    }

}
