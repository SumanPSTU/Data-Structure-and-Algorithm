package LinkedList;
public class Linkedlist {
    private Node head;
    private Node tail;
    private int size = 0;
    public static class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    void addFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = tail = node;
        }else {
            node.next = head;
            head = node;
        }
        size++;
    }
    void addLast(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size){
            addLast(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Node node = new Node(data);
        node.next = current.next;
        current.next = node;
        size++;
    }
    void delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next == tail){

            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    void display() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(sb.toString().trim());
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
}