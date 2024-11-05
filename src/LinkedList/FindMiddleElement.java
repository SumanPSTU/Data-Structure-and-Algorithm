package LinkedList;

public class FindMiddleElement {
    ListNode head;
    ListNode tail;
    static class ListNode{
        ListNode next;
        int value;
        ListNode(int value){
            this.value = value;
        }
    }

    public void add(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public static ListNode middle(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < count/2; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        // connect Node each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(middle(a).value);
        System.out.println(middleNode(a).value);
    }
}
