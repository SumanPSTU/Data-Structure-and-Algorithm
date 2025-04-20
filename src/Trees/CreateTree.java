package Trees;

import LinkedList.Linkedlist;
import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class CreateTree {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    static Node createTree() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = scanner.nextInt();
        if (data == -1 )return null;

        return root;
    }
}




class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}