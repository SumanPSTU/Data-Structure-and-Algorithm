package LinkedList;

public class FindingEnterSection {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public Node getIntersectionNode(Node headA, Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int countA = 0;
        int countB = 0;
        while (tempA!=null){
            countA++;
            tempA = tempA.next;
        }
        while (tempB!=null){
            countB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (countA>countB){
            for (int i = 0; i < countA-countB; i++) {
                tempA = tempA.next;
            }
        }else {
            for (int i = 0; i < countB-countA; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA!=null && tempB!=null){
            if (tempA==tempB){
                return tempA;
            }
            tempB = tempB.next;
            tempA = tempA.next;
        }
        return null;
    }

        public static void main(String[] args) {
        Node x = new Node(80);
        Node a = new Node(34);
        Node b = new Node(3);
        Node c = new Node(10);
        Node d = new Node(9);
        Node e = new Node(56);
        Node f = new Node(78);

        x.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // creating second linked list
        Node a1 = new Node(11);
        Node b1 = new Node(99);
        a1.next = b1;
        b1.next = d;
        display(a);
        display(a1);
       FindingEnterSection k = new FindingEnterSection();
       System.out.println(k.getIntersectionNode(x,a1).value);


    }
}
