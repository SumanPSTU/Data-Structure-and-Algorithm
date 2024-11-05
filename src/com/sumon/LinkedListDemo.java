package com.sumon;
public class LinkedListDemo<T> {
    private ListNode head;
    private ListNode tail;
    private int size = 0;

    private class ListNode{
        T value;
        ListNode next;
        ListNode(T value){
            this.value = value;
        }
    }
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void addFirst(T value){
        ListNode node = new ListNode(value);
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void addLast(T value){
        ListNode node = new ListNode(value);
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAt(int index, T value){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        if (index == 0){
            addFirst(value);
            return;
        }
        if (index == size){
            addLast(value);
            return;
        }
        ListNode node = new ListNode(value);
        ListNode temp = head;
        for (int i =1; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void delete(int index){
        if (index == 0){
            if (head == tail){
                head = tail = null;
            }else {
                head = head.next;
            }
            size--;
            return;
        }
        ListNode temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }
        if (temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    public int getSize(){
        return size;
    }
}