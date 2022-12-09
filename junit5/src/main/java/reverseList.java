public class reverseList {

    public ListNode reverselist(ListNode head) {

        if (head == null)
            return null;

        ListNode p = null, q = head, r = head.next;
        while (q != null) {
            q.next = p;
            p = q;
            q = r;
            if (r != null)
                r = r.next;
        }

        return p;

    }
}
