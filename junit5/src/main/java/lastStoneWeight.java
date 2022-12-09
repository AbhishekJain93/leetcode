import java.util.Arrays;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public int laststoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((Integer o1, Integer o2) -> Integer.compare(o2, o1));
        heap.addAll(Arrays.stream(stones).boxed().toList());

        while (heap.size() > 1) {
            int max1 = heap.poll();
            int max2 = heap.poll();

            if (max1 > max2)
                heap.add(max1 - max2);
        }

        return heap.size() > 0 ? heap.poll() : 0;
    }
}
