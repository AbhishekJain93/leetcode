import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingOffers638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        Map<List<Integer>, Integer> dp = new HashMap<>();

        return dpHelper(price, special, needs, dp);
    }

    private int dpHelper(List<Integer> price, List<List<Integer>> special, List<Integer> needs,
            Map<List<Integer>, Integer> dp) {
        if (dp.containsKey(needs))
            return dp.get(needs);

        int min = individualSum(price, needs);

        for (List<Integer> offer : special) {
            if (isValid(offer, needs)) {
                List<Integer> newNeeds = new ArrayList<>();
                for (int i = 0; i < needs.size(); i++) {
                    newNeeds.add(needs.get(i) - offer.get(i));
                }

                min = Math.min(min, offer.get(needs.size()) + dpHelper(price, special, newNeeds, dp));
            }
        }

        dp.put(needs, min);
        return min;
    }

    private boolean isValid(List<Integer> offer, List<Integer> needs) {
        for (int i = 0; i < needs.size(); i++) {
            if (needs.get(i) < offer.get(i))
                return false;
        }

        return true;
    }

    private int individualSum(List<Integer> price, List<Integer> needs) {
        int total = 0;

        for (int i = 0; i < needs.size(); i++) {
            total += needs.get(i) * price.get(i);
        }

        return total;
    }
}
