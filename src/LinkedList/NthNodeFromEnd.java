package LinkedList;

public class NthNodeFromEnd {

    public static Node getNode(Node head, int pos) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < pos; i++) {
            if (fast == null) return null; // If pos is greater than the length of the list
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    static void deleteFromEnd(Node head, int pos) {
        Node fast = head;
        Node slow = head;
        for (int i =1;i<pos;i++){
            fast = fast.next;
        }
        if (fast==null){
            head = head.next;
            return;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(9);
        Node c = new Node(34);
        Node d = new Node(55);
        Node e = new Node(12);
        Node f = new Node(56);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Node at 4th position from end: " + getNode(a, 4).val);
        System.out.print("Original list: ");
        display(a);
        deleteFromEnd(a, 6);
        System.out.print("List after deleting 6th node from end: ");
        display(a);
    }
}
