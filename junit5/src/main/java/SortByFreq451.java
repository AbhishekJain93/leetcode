import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class SortByFreq451 {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            freq.put(s1[i], freq.getOrDefault(s1[i], 0) + 1);
        }

        PriorityQueue<CharFreq> heap = new PriorityQueue<>((CharFreq a, CharFreq b) -> Integer.compare(b.freq, a.freq));

        for (Entry<Character, Integer> e : freq.entrySet()) {
            heap.add(new CharFreq(e.getKey(), e.getValue()));
        }

        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            CharFreq c = heap.poll();
            for (int i = 0; i < c.freq; i++) {
                sb.append(c.c);
            }
        }

        return sb.toString();
    }
}

class CharFreq {
    char c;
    int freq;

    public CharFreq(char ch, int t) {
        c = ch;
        freq = t;
    }
}
