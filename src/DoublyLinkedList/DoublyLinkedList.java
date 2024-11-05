package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    static int size = 0;
    static class Node {
        int val;
        Node prev;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }
    void deleteAt(int index) {
        if (size == 0) throw new IllegalArgumentException("Empty element");
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bound");

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // List is now empty
            }
            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = temp;
        }
        size--;
    }
    void addLast(int val){
        Node node = new Node(val);
        if (head==null){
            head = tail = null;
            size++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    void insertAt(int index,int val){
        if (index<0 || index>size) throw new IndexOutOfBoundsException("Index out of bound");
        if (index==0){
            addFirst(val);
            return;
        }
        if (index==size){
            addLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;

    }
    void size(){
        System.out.println("Size is "+size);
    }
    void displayPrev(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println("End");
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.addFirst(45);
        d.addLast(34);
        d.addFirst(90);
        d.addFirst(56);
        d.addFirst(50);
        d.addLast(100);
        d.insertAt(0,4);
        d.insertAt(5,900);
        d.insertAt(1,2000);
        d.deleteAt(0);
        d.size();
        d.display();
        d.displayPrev();
    }
}
