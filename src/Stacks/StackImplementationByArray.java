package Stacks;

import java.util.Arrays;

public class StackImplementationByArray {
    private static class Stack{
        private int index = 0;
        private int size = 0;
        private int[] array = new int[1];
        void push(int value){
            if(index == array.length){
                int[] nArray = new int[array.length+1];
                System.arraycopy(array,0,nArray,0,array.length);
                array = nArray;
            }
            array[index++] = value;
            size++;
        }
        void display()  {
            System.out.println(Arrays.toString(array));
        }
        boolean isEmpty(){
            return index == 0;
        }
        int size(){
            return size;
        }
        int peek(){
            if (index==0) throw new RuntimeException("Empty Stack");
            return array[size-1];
        }
        int pop(){
            if (index == 0){
                throw new IndexOutOfBoundsException("Empty Stack");
            }
            int r = array[size-1];
            if (index!=0){
                int[] nArray = new int[array.length-1];
                System.arraycopy(array,0,nArray,0,array.length-1);
                array = nArray;
                size--;
            }
            return r;
        }
    }
    public static void main(String[] args) {
        StackImplementationByArray.Stack stack = new Stack();
        stack.push(89);
        stack.push(89);
        stack.push(89);
        stack.push(89);
        stack.push(89);
        stack.push(89);
        stack.push(8);
        stack.display();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
    }
}
