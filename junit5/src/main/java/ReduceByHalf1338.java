import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ReduceByHalf1338 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        SortedSet<Tuplex> set = new TreeSet<>((Tuplex t1, Tuplex t2) -> {
            if (t1.freq != t2.freq)
                return Integer.compare(t2.freq, t1.freq);
            else
                return Integer.compare(t1.val, t2.val);
        });

        for (Entry<Integer, Integer> e : map.entrySet()) {
            set.add(new Tuplex(e.getKey(), e.getValue()));
        }

        int halfSize = 0;
        int count = 0;
        Iterator<Tuplex> it = set.iterator();
        while (halfSize < arr.length / 2) {
            halfSize += it.next().freq;
            count++;
        }

        return count;
    }

}

class Tuplex {
    public int val;
    public int freq;

    public Tuplex(int v, int f) {
        this.val = v;
        this.freq = f;
    }
}
