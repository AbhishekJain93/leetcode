import java.util.Optional;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class CodingTesStack {

    OperationFactory opFactory = new OperationFactory();

    public static void main(String[] args) {
        // 8 exptected
        System.out.println(new CodingTesStack().solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    public int solution(String S) {
        Stack<Integer> stack = new Stack<>();

        try {

            String[] tokens = S.split(" ");

            for (int i = 0; i < tokens.length; i++) {
                Operation op = getOperation(tokens[i]);

                Integer val = null;
                try {
                    val = Integer.parseInt(tokens[i]);
                } catch (Exception e) {
                    val = Integer.valueOf("-1");
                    // operand is not a number
                }

                op.perform(stack, Optional.of(val));
            }

            return stack.isEmpty() ? -1 : stack.peek();
        } catch (Exception e) {
            return -1;
        }

    }

    private int execute(Stack<Integer> stack, Operation op, Optional<Integer> arg) {
        return op.perform(stack, arg);

    }

    private Operation getOperation(String token) throws Exception { // use switch statement for Operation factory

        return this.opFactory.getOperation(token);

    }

}

class OperationFactory {

    Map<String, Operation> registry;

    public OperationFactory() {

        this.registry = new HashMap<String, Operation>();
        this.registry.put("DUP", new DupOp());
        this.registry.put("+", new AddOp());
        this.registry.put("-", new SubOp());
        this.registry.put("NUM", new PushOp());
        this.registry.put("POP", new PopOp());
    }

    public Operation getOperation(String token) throws Exception {
        if (registry.containsKey(token))
            return registry.get(token);

        int operand = Integer.parseInt(token);
        if (operand >= 0 && operand < 2e20) {
            return registry.get("NUM");
        } else {
            throw new Exception("invalid operand");
        }

    }

}

/*
 * This is the interface for specifying the permitted operations on the stack
 */
interface Operation {

    public int perform(Stack<Integer> stack, Optional<Integer> arg);

}

class PushOp implements Operation {
    public int perform(Stack<Integer> stack, Optional<Integer> arg) {
        if (!arg.isPresent())
            return -1;

        int value = arg.get();
        if (value < 0 || value >= 2e20) {
            return -1;
        }
        stack.push(value);

        return 1;
    }
}

class PopOp implements Operation {
    public int perform(Stack<Integer> stack, Optional<Integer> arg) {
        if (stack.isEmpty())
            return -1;

        stack.pop();

        return 1;
    }
}

class AddOp implements Operation {
    public int perform(Stack<Integer> stack, Optional<Integer> arg) {
        if (stack.size() < 2)
            return -1;

        int val1 = stack.pop();
        int val2 = stack.pop();

        if (val1 + val2 >= 2e20) {
            return -1;

        }
        stack.push(val1 + val2);
        return 1;
    }
}

class SubOp implements Operation {
    public int perform(Stack<Integer> stack, Optional<Integer> arg) {
        if (stack.size() < 2)
            return -1;

        int val1 = stack.pop();
        int val2 = stack.pop();
        if (val1 - val2 < 0) {
            return -1;

        }
        stack.push(val1 - val2);
        return 1;
    }
}

class DupOp implements Operation {
    public int perform(Stack<Integer> stack, Optional<Integer> arg) {
        if (stack.size() < 1)
            return -1;

        int val1 = stack.peek();

        stack.push(val1);
        return 1;
    }
}
