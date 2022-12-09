import java.util.Stack;

public class decodeString {

    public static void main(String[] args) {
        System.out.println(new decodeString().decodestring("3[a]2[bc]"));
    }

    public String decodestring(String s) {
        StringBuilder current = new StringBuilder();
        String multiplier = "";
        Stack<Integer> freqStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        char[] s1 = s.toCharArray();
        int i = 0;
        while (i < s1.length) {
            if (Character.isLetter(s1[i])) {
                current.append(s1[i]);
            } else if (Character.isDigit(s1[i])) {
                multiplier += s1[i];
            } else if (s1[i] == '[') {
                freqStack.push((Integer.parseInt(multiplier)));
                multiplier = "";
                stringStack.push(current);
                current = new StringBuilder();
            } else if (s1[i] == ']') {
                int m = freqStack.pop();
                StringBuilder saved = stringStack.pop();
                for (int j = 0; j < m; j++) {
                    saved.append(current);
                }
                current = saved;
            }
            i++;
        }

        return current.toString();
    }
}
