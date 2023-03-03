import java.util.ArrayList;
import java.util.List;

public class MinFuel2477 {

    long min = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= roads.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < roads.length; i++) {
            int[] e = roads[i];
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        minFuelHelper(adj, seats, 0, 0);

        return min;
    }

    private long minFuelHelper(List<List<Integer>> adj, int seats, int node, int parent) {
        int rep = 0;
        for (Integer n : adj.get(node)) {
            if (n == parent)
                continue;

            rep += minFuelHelper(adj, seats, n, node);
        }

        if (node != 0) // exclude the root 0 node as traffic stop after reaching 0 and don't pass 0
            min += Math.ceil((rep + 1.0) / seats);

        return rep + 1;
    }
}
