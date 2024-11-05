package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(89);
        q.add(90);
        q.add(89);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.element());
        Queue<Integer> queue = new LinkedList<>();
        for (int i :q){
            System.out.println(i);
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
    }
}