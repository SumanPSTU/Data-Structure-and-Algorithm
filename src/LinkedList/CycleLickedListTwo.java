package LinkedList;

public class CycleLickedListTwo {
    static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next ==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = head;
                while(temp!=slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        // connect Node each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    }
}
