public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(5));
    }

    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (n == 2)
            return 1;

        int first = 1, second = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }
}
