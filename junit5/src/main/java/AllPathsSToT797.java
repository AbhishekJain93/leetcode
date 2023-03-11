import java.util.ArrayList;
import java.util.List;

public class AllPathsSToT797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        helper(graph, 0, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[][] graph, int node, List<Integer> path, List<List<Integer>> res) {
        path.add(node);
        if (node == graph.length - 1) {
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        for (int i = 0; i < graph[node].length; i++) {
            helper(graph, graph[node][i], path, res);
        }

        path.remove(path.size() - 1);
    }
}
