import java.util.Stack;

public class ValidParenthesis {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == '(' || s1[i] == '{' || s1[i] == '[')
				stack.push(s1[i]);

			else if (stack.isEmpty())
				return false;
			else if (s1[i] == ')' && stack.peek() == '(')
				stack.pop();
			else if (s1[i] == ')' && stack.peek() != '(')
				return false;
			else if (s1[i] == '}' && stack.peek() == '{')
				stack.pop();
			else if (s1[i] == '}' && stack.peek() != '{')
				return false;
			else if (s1[i] == ']' && stack.peek() == '[')
				stack.pop();
			else if (s1[i] == ']' && stack.peek() != '[')
				return false;
		}

		return stack.isEmpty();
	}
}