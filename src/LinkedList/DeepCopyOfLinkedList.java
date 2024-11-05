package LinkedList;

public class DeepCopyOfLinkedList {
    static class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to create a deep copy of the linked list
    public static ListNode deepCopy(ListNode head) {
        if (head == null) return null;

        // Create a dummy node to simplify the deep copy logic
        ListNode dummy = new ListNode(-1);
        ListNode currentNew = dummy;
        ListNode currentOld = head;

        // Iterate through the original list and copy nodes
        while (currentOld != null) {
            currentNew.next = new ListNode(currentOld.val);  // Create a new node with the same value
            currentNew = currentNew.next;
            currentOld = currentOld.next;
        }

        return dummy.next;  // Return the head of the new copied list
    }

    // Function to compare two lists for equality
    public static boolean areEqual(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(6);
        ListNode e = new ListNode(9);
        // Connect nodes together
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // Create a deep copy of the list
        ListNode copy = deepCopy(a);

        // Verify that the deep copy is identical to the original
        System.out.println(areEqual(a, copy));  // Should print true
    }
}
