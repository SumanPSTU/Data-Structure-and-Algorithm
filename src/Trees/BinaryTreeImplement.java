package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplement{
    // Node class for each node of the tree
    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Class responsible for building the tree
    public static class BuildTree {
        static int index = -1;

        public Node buildBinaryTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            Node node = new Node(nodes[index]);
            node.left = buildBinaryTree(nodes);
            node.right = buildBinaryTree(nodes);

            return node;
        }
    }

    // Preorder traversal to test the tree
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // Inorder traversal to test the tree

    public static void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    // Level order traversal (BFS)
    public static void levelOrderTraversal(Node root) {
       if  (root == null) return;

       Queue<Node> queue = new LinkedList<>();

       queue.add(root);
       queue.add(null);
       while (!queue.isEmpty()){
           Node current = queue.remove();
           if (current == null){
               System.out.println();
               if (!queue.isEmpty()){
                   queue.add(null);
               }

           }else {
               System.out.print(current.data+" ");
               if (current.left != null){
                   queue.add(current.left);
               }
               if (current.right != null){
                   queue.add(current.right);
               }

           }
       }
    }
    //count total sum of the node

    public static int sumOfNode(Node node){
        if (node == null) return 0;
        int leftNode = sumOfNode(node.left);

        int rightNode = sumOfNode(node.right);
        return leftNode + rightNode + node.data;
    }

    // count total number of node
    public static  int totalNode(Node node){
        if (node == null) return 0;

        int leftNode = totalNode(node.left);
        int rightNode = totalNode(node.right);

        return leftNode + rightNode + 1;
    }

    public static int heightOfTree(Node node){
        if (node == null) return 0;

        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);

        return Math.max(leftHeight,rightHeight)+1;
    }
    // Main method
    public static void main(String[] args) {
        int[] array = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildTree builder = new BuildTree();
        Node root = builder.buildBinaryTree(array);

        System.out.println("Preorder Traversal of the tree:");
        preorder(root);
        System.out.println("\ninorder traversal of the tree");
        inorder(root);
        System.out.println();
        System.out.println(totalNode(root));
        System.out.println(sumOfNode(root));
        System.out.println(heightOfTree(root));
    }
}
