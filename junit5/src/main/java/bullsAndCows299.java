import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bullsAndCows299 {
    public static void main(String[] args) {
        System.out.println(new bullsAndCows299().getHint(
                "1755610401790853886621601273356239131237036416475341491309983116457714010837814341537665072844465902487862603682766863999446470718",
                "0774867384434139291263283673186763321445554972546073306066405988561095238734155866536569811386471850431628352952003512920587668768"));
    }

    public String getHint(String secret, String guess) {
        char[] s1 = secret.toCharArray();
        char[] g1 = guess.toCharArray();

        Map<Character, List<Integer>> idxMapS = new HashMap<>();
        Map<Character, List<Integer>> idxMapG = new HashMap<>();

        for (int i = 0; i < s1.length; i++) {
            List<Integer> list = idxMapS.getOrDefault(s1[i], new ArrayList<>());
            list.add(i);
            idxMapS.put(s1[i], list);
        }

        for (int i = 0; i < g1.length; i++) {
            List<Integer> list = idxMapG.getOrDefault(g1[i], new ArrayList<>());
            list.add(i);
            idxMapG.put(g1[i], list);
        }

        int bulls = 0, cows = 0;
        for (java.util.Map.Entry<Character, List<Integer>> e : idxMapG.entrySet()) {
            if (idxMapS.containsKey(e.getKey())) {

                List<Integer> secretList = idxMapS.get(e.getKey());
                List<Integer> guessList = e.getValue();
                int i = 0, j = 0, hits = 0;

                while (i < secretList.size() && j < guessList.size()) {
                    if (secretList.get(i).intValue() == guessList.get(j).intValue()) {
                        hits++;
                        i++;
                        j++;
                    } else if (secretList.get(i).intValue() < guessList.get(j).intValue()) {
                        i++;
                    } else {
                        j++;
                    }
                }
                bulls += hits;
                cows += Math.min(guessList.size() - hits, secretList.size() - hits);
            }
        }

        return bulls + "A" + cows + "B";
    }
}
