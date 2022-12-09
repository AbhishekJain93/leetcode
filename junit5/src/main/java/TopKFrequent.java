import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            freq.put(words[i], freq.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<StringFreq> q = new PriorityQueue<>((StringFreq s1, StringFreq s2) -> {
            if (s1.freq == s2.freq)
                return s1.word.compareTo(s2.word);
            return Integer.compare(s2.freq, s1.freq);
        });

        q.addAll(freq.entrySet().stream().map(e -> new StringFreq(e.getKey(), e.getValue())).toList());

        List<String> result = new ArrayList<>();
        int count = Math.min(k, q.size());

        for (int i = 0; i < count; i++) {
            result.add(q.poll().word);
        }

        return result;
    }

}

class StringFreq {
    public String word;
    public int freq;

    public StringFreq(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
}