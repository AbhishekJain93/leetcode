import java.util.Arrays;

public class SucessfulPairs2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int[] count = new int[spells.length];

        for (int i = 0; i < count.length; i++) {
            int idx = binarySearchX(potions, success, spells[i], 0, potions.length - 1);

            count[i] = potions.length - idx;
        }

        return count;
    }

    private int binarySearchX(int[] potions, long success, long spell, int l, int h) {
        if (h == l && potions[h] * spell < success)
            return h + 1;

        if (h == l)
            return h;

        if (h - l == 1 && potions[l] * spell >= success)
            return l;

        int m = l + (h - l) / 2;

        if (potions[m] * spell < success)
            return binarySearchX(potions, success, spell, m + 1, h);

        else
            return binarySearchX(potions, success, spell, l, m);

    }
}
