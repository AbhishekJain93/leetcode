import java.util.Stack;

public class CompressedStringIterator604 {
	Stack<Character> chStack = new Stack<>();
	Stack<Integer> freqStack = new Stack<>();

	public CompressedStringIterator604(String compressedString) {
		char[] s1 = compressedString.toCharArray();

		int i = s1.length - 1;
		while (i >= 0) {
			if (('a' <= s1[i] && 'z' >= s1[i]) || ('A' <= s1[i] && 'Z' >= s1[i])) {
				chStack.push(s1[i]);
				i--;
			} else {
				StringBuilder freq = new StringBuilder();
				while (i >= 0 && '0' <= s1[i] && '9' >= s1[i]) {
					freq.append(s1[i--]);
				}

				freqStack.push(Integer.parseInt(freq.reverse().toString()));
			}
		}
	}

	public char next() {
		if (chStack.isEmpty())
			return ' ';
		char rt = chStack.pop();
		int frequency = freqStack.pop();
		if (frequency > 1) {
			chStack.push(rt);
			freqStack.push(frequency - 1);
		}

		return rt;
	}

	public boolean hasNext() {
		return !chStack.isEmpty();

	}
}
