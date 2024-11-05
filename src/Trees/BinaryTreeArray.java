package Trees;

import java.util.Arrays;

public class BinaryTreeArray {
    int[] tree;
    int size;
    public BinaryTreeArray(int capacity){
        tree = new int[capacity];
        size = 0;
        Arrays.fill(tree,-1);
    }
    public void add(int value){
        if (size == tree.length){
            System.out.println("Tree is full, can't insert any other value");
            return;
        }
        tree[size++] = value;
    }
    public void preOrderTraversal(int index){
        StringBuilder sb = new StringBuilder();
        if (index >= size || tree[index] == -1) return;
        sb.append(tree[index]).append(" ");
        preOrderTraversal( 2*index +1);
        preOrderTraversal( 2*index + 2);

        String re    = sb.substring(0,sb.length()).trim();
        System.out.print(re);
    }
    public static void main(String[]args){
        BinaryTreeArray binaryTree = new BinaryTreeArray(15);

        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(7);

        binaryTree.preOrderTraversal(0);
    }
}