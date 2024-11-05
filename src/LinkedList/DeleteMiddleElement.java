package LinkedList;


public class DeleteMiddleElement {
    static class ListNode{
        ListNode next;
        int value;
        ListNode(int value){
            this.value = value;
        }
    }
   /* public ListNode deleteMiddle(ListNode head){

    }*/
   public static ListNode deleteMiddleCheck(ListNode head){
       if (head==null||head.next == null){
           return null;
       }
       ListNode temp = head;
       int count = 0;
       while (temp!=null){
           count++;
           temp = temp.next;
       }
       temp = head;
       for (int i = 1; i < count/2; i++) {
           temp = temp.next;
       }
       if (temp.next!=null){
           temp.next = temp.next.next;
       }
       return head;
   }
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static ListNode deleteOther(ListNode head){
        if (head==null || head.next==null)return null;
        ListNode slow = head;
        ListNode prev = null;
        ListNode fast = head;
        while (fast!=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev!=null){
            prev.next = prev.next.next;
        }
        return head;
    }
   public static ListNode deleteAnotherWay(ListNode head){
       if (head == null || head.next == null) return null;
       ListNode fast = head;
       ListNode slow = head;
       while (fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       slow.value = slow.next.value;
       slow.next = slow.next.next;
       return head;
   }
    static void display(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
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
        //display(deleteMiddleCheck(a));
        display(deleteOther(a));
    }
}
