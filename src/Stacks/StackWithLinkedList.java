package Stacks;

import java.util.Arrays;

public class StackWithLinkedList {
    private static int size = 0;
    private Stack head;
    static class Stack{
        private int val;
        private Stack next;
        Stack(int val){
            this.val = val;
        }
    }
    void push(int val){
        Stack stack = new Stack(val);
        stack.next = head;
        head = stack;
        size++;
    }
    void display(){
        Stack temp = head;
        int i = size-1;
        int[] array = new int[size];
        while (temp!=null){

            array[i--] = temp.val;
            temp = temp.next;
        }
        System.out.println(Arrays.toString(array));
    }
    void peek(){
        if (head==null){
            System.out.println("Empty Stack");
        }else {
            System.out.println(head.val);
        }
    }
    int pop(){
        if (head==null) return -1;
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    boolean isEmpty(){
        if (head==null) return true;
        return false;
    }
    int size(){
        return size;
    }
    public static void main(String[] args){
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(89);
        stack.push(9);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        stack.push(89);
        stack.push(9);
        stack.display();
        stack.push(89);
        stack.push(9);
        stack.display();
        stack.push(89);
        stack.push(9);
        stack.display();
        System.out.println(stack.isEmpty());
        stack.display();
        System.out.println(stack.size());
    }
}