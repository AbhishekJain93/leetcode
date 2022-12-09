import java.util.HashSet;
import java.util.Set;

public class detectcycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        set.add(head);
        ListNode p = head;

        while (p.next != null) {
            ListNode current = p.next;
            if (set.contains(current))
                return current;

            set.add(current);
            p = p.next;
        }

        return null;
    }
}
