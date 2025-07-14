package com.sumon;
public class Main {
    public static void main(String[] args) {
        LinkedListDemo<String> listDemo = new LinkedListDemo<>();
        listDemo.addLast("Sumon");
        listDemo.insertAt(0,"Sakira");
        listDemo.addLast("Sujon");
        listDemo.addLast("Palash");
        listDemo.insertAt(1,"Shekhor");
        listDemo.display();
        listDemo.delete(3);
        listDemo.display();
        System.out.println(listDemo.getSize());
    }
}
