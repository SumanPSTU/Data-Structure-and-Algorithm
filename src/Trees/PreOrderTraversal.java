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


        // Manually connecting nodes to form a binary tree

        // Left and right child of root
        root.left = node1; // 10
        root.right = node2; // 200

        // Left and right child of node1 (10)
        node1.left = node3; // 5
        node1.right = node4; // 15


        preOrderTraversal(root);
    }
}