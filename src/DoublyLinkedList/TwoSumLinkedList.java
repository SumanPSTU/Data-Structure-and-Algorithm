package DoublyLinkedList;

public class TwoSumLinkedList {
    private static int size = 0;
    private ListNode head;
    private ListNode tail;
    private static class ListNode{
        int value;
        ListNode prev;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }
    void display(ListNode head){
        ListNode temp =head;
        while (temp!= null){
            System.out.print(temp.value+" ");
        }
        System.out.println();
    }
    void addFirst(int value){
        ListNode node = new ListNode(value);
        if (head==null){
            head = tail = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return;
    }
    void addLast(int value){
        ListNode node = new ListNode(value);
        if (tail==null){
            head = tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
        return;
    }
    void add(int index, int value){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        if (index==0){
            addFirst(value);
            return;
        }
        if (index==size){
            addLast(value);
            return;
        }
        ListNode node = new ListNode(value);
        ListNode temp = head;
        for (int i =1;i<index;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }
    void delete(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        if (index==0){
            head = head.next;
            if (head.prev!=null){
                head.prev = null;
            }else {
                tail = null;
            }
            size--;
            return;
        }
        if (index==size-1){
            tail = tail.prev;
            if (tail.next!=null){
                tail.next = null;
            }else {
                head = null;
            }
            size--;
            return;
        }
        ListNode temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }
        ListNode toDelete = temp.next;
        temp.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = temp;
        }
        size--;

    }

    public static void main(String[] args) {

    }
    public static boolean twoSum(ListNode head,ListNode tail,int target){
        ListNode headNode = head;
        ListNode tailNode = tail;
        while (headNode!=tailNode){
            if (headNode.value + tailNode.value==target) return true;
            if (headNode.value + tailNode.value>target) tailNode = tailNode.prev;
            if (headNode.value + tailNode.value<target) headNode = headNode.next;
        }
        return false;
    }
}
