class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        if (this.next == null)
            return "" + this.val + " | ";

        return "" + this.val + " -> " + this.next.toString();
    }

}

public class mergeLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(new mergeLists().mergeTwoLists(list1, list2));

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start, p;
        if (list1.val <= list2.val) {
            start = list1;
            list1 = list1.next;
        } else {
            start = list2;
            list2 = list2.next;

        }

        p = start;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        while (list1 != null) {
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }

        while (list2 != null) {
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }

        return start;
    }
}