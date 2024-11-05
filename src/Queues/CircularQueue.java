package Queues;

public class CircularQueue {
    private int capacity;
    private int size;
    private int rear;
    private int front;
    private int[] queue;
    public CircularQueue(int capacity){
        this.rear = -1;
        this.front = -1;
        this.capacity = capacity;
        this.size = 0;
        queue = new int[capacity];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full. can't insert new element");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty. Nothing to peek!");
            return -1;
        }
        return queue[front];
    }
    public int size(){
        return size;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty. Nothing to remove!!");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }
    public void display(){
        StringBuilder sb = new StringBuilder();
        System.out.println("element of queue is:");
        for (int i = 0;i<size;i++){
            sb.append(queue[(front + i) % capacity]).append(",");
        }
        System.out.println(sb.toString().substring(0,sb.length()));
    }
}