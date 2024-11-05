package Others;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(90);
        System.out.println(list.get(3));
        Collections.sort(list);
        System.out.println(list);
        list.set(4,40);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}