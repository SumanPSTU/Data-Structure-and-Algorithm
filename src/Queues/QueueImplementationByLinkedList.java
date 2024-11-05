package Queues;
import java.util.NoSuchElementException;

public class QueueImplementationByLinkedList {
    Node head;
    Node tail;
    private int size = 0;

    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        int x = head.value;
        head = head.next;
        size--;
        return x;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.value;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
    public boolean contains(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        QueueImplementationByLinkedList queue = new QueueImplementationByLinkedList();
        System.out.println(queue.isEmpty());
        queue.add(89);
        queue.add(90);
        queue.add(34);
        queue.add(56);
        queue.display();
        System.out.println(queue.contains(0));
    }
}
