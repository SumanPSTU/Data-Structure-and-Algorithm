package Trees;


public class PreOrderTraversal {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
            this.left = this.right = null;
        }
    }
    public static void preOrderTraversal(TreeNode node){
        if (node == null) return;
        System.out.println("Value is "+node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public static void main(String[] args) {
        // Creating the root node
        TreeNode root = new TreeNode(100);

        // Creating other nodes
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(200);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(150);
        TreeNode node6 = new TreeNode(250);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(12);
        TreeNode node10 = new TreeNode(18);
        TreeNode node11 = new TreeNode(130);
        TreeNode node12 = new TreeNode(170);
        TreeNode node13 = new TreeNode(240);
        TreeNode node14 = new TreeNode(260);

        // Manually connecting nodes to form a binary tree

        // Left and right child of root
        root.left = node1; // 10
        root.right = node2; // 200

        // Left and right child of node1 (10)
        node1.left = node3; // 5
        node1.right = node4; // 15

        // Left and right child of node2 (200)
        node2.left = node5; // 150
        node2.right = node6; // 250

        // Left and right child of node3 (5)
        node3.left = node7; // 3
        node3.right = node8; // 7

        // Left and right child of node4 (15)
        node4.left = node9; // 12
        node4.right = node10; // 18

        // Left and right child of node5 (150)
        node5.left = node11; // 130
        node5.right = node12; // 170

        // Left and right child of node6 (250)
        node6.left = node13; // 240
        node6.right = node14; // 260
        preOrderTraversal(root);
    }
}