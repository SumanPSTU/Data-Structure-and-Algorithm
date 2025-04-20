package ArrayList;

import java.util.Arrays;

public class Array_List<T> {
    private int size;
    private int index;
    private Object[] array;
    public Array_List(){
        size = 0;
        index = 0;
        array = new Object[1];
    }

    public void add(T value){
        if (index == array.length){
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[index++] = value;
        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void set(int index, T value){
        if (index < 0 || index >= size){
            System.out.println("Index out of bounds");
            return;
        }
        array[index] = value;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if (size == 0){
            throw new IndexOutOfBoundsException("List is empty");
        }
        return (T) array[index];
    }

   public void remove(){
        if (size == 0){
            System.out.println("List is empty");
            return;
        }
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
        size--;
        index--;
   }
    public void display(){
        if (size == 0){
            System.out.println("List is empty");
            return;
        }
        System.out.println(Arrays.toString(array));
    }
}