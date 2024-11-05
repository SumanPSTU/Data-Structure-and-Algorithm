package LinkedList;
public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(45);
        list.addLast(4);
        list.addFirst(90);
        list.addLast(100);

        list.insertAt(0,39);
        list.insertAt(4,50);
        list.insertAt(2,34);
        list.insertAt(7,43);
        list.delete(7);
        list.size();
        list.display();

    }
}
