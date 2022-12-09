import java.util.SortedSet;
import java.util.TreeSet;

public class nthUglyNumbr {

    public int nthUglyNumber(int n) {
        SortedSet<Double> sorted = new TreeSet<>();
        sorted.add((double) 1);

        double nth = (double) 1;
        while (n > 0) {
            nth = sorted.first();
            sorted.remove(nth);
            sorted.add(nth * 2);
            sorted.add(nth * 3);
            sorted.add(nth * 5);
            n--;
        }

        return (int) nth;
    }
}
